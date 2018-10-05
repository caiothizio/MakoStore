/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mako.model.Produto;

/**
 *
 * @author CaioThizio
 */
public class ProdutoDAO implements java.io.Serializable{
    private final static ArrayList <Produto> listaProdutos = new ArrayList<>();;
    
    public static final Produto buscaPorNome(String nome){
        for(Produto p : listaProdutos){
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
    }
    
    public static final Produto buscaPorId(int id){
        for(Produto p : listaProdutos){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
    
    public static final int buscaIndex(String nome){
        for(Produto p : listaProdutos){
            if(p.getNome().equals(nome)){
                return listaProdutos.indexOf(p);
            }
        }
        return -1;
    }
    
    public static final String cadastrar(Produto p){
        try{
            listaProdutos.add(p);
        }catch(Exception e){
            return "Erro no cadastro!\n" + e.getMessage();
        }
        return "Cadastro realizado com sucesso!";
    }
    
    public static final String deletar(Produto p){
        try{
            listaProdutos.remove(p);
        }catch(Exception e){
            return "Erro na remoção!\n" + e.getMessage();
        }
        return "Remoção realizada com sucesso!";
    }
    
    public static final String atualizar(int ind, Produto p){
        try{
            listaProdutos.add(ind, p);
        }catch(Exception e){
            return "Erro na atualização!\n" + e.getMessage();
        }
        return "Atualização realizada com sucesso!";
    }

    public static final void leProdutos() throws IOException {
        File log = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\produto\\", "log_produto.txt");
        FileReader leitor = new FileReader(log);
        try (BufferedReader buffer = new BufferedReader(leitor)) {
            String linha = "-";
            
            while(buffer.ready()){
                if("-".equals(linha)){
                    Produto p = new Produto();
                    
                    p.setId(Integer.parseInt(buffer.readLine()));
                    p.setNome(buffer.readLine());
                    p.setPrecoCusto(Double.parseDouble(buffer.readLine()));
                    p.setPrecoRevenda(Double.parseDouble(buffer.readLine()));
                    p.setQtde(Integer.parseInt(buffer.readLine()));
                    p.setObs(buffer.readLine());
                    linha = buffer.readLine();
                    p.setListaTipo(buffer.readLine());
                    listaProdutos.add(p);
                }
            }
        }
    }

    public static final void escreveProdutos() throws IOException {
        File log = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\produto\\", "log_produto.txt");
        FileWriter escritor = new FileWriter(log, false);
        try (BufferedWriter buffer = new BufferedWriter(escritor)) {
            for(Produto p : listaProdutos){
                buffer.write(Integer.toString(p.getId()) + "\n" + p.getNome() + "\n" + Double.toString(p.getPrecoCusto()) + "\n" + Double.toString(p.getPrecoRevenda()) + "\n" + Integer.toString(p.getQtde()) + "\n" + p.getObs() + "\n" + p.getListaTipo() + "\n");
                
                buffer.write("\n-\n");
            }

            buffer.flush();
        }
    }
    
    public static final void escreveProdutosBin() throws IOException{
        File logBin = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\produto\\", "log_produto.mako");
        ObjectOutputStream escritor = BinarioIO.criarEscritor(logBin, true);
        listaProdutos.forEach((p) -> {
            BinarioIO.escrever(escritor, p, true);
        });
    }
    
    public static final void apagarFiles(){
        try{
            File logTxt = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\produto\\", "log_produto.txt");
            File logBin = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\produto\\", "log_produto.mako");
            FileWriter escritor = new FileWriter(logTxt, false);
            ObjectOutputStream escritorBin = BinarioIO.criarEscritor(logBin, false);
            BufferedWriter buffer = new BufferedWriter(escritor);
            
            buffer.write("");
            BinarioIO.escrever(escritorBin, "", true);
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Erro ao apagar arquivos: "+e, "Erro de remoção", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static final boolean adicionarProdutoBD(Produto p){
        try{
            ConnectionFactory.acessaBD();
            String querydados = "insert into mako.produto" + "(produto_id, produto_nome, produto_precocusto, produto_precorevenda, produto_qtde, produto_tipo, produto_obs)" + "values (?, ?, ?, ?, ?, ?, ?);";
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            PreparedStatement st = ConnectionFactory.getConnection().prepareStatement(querydados);
           
            
            st.setInt(1, p.getId());
            st.setString(2, p.getNome());
            st.setDouble(3, p.getPrecoCusto());
            st.setDouble(4, p.getPrecoRevenda());
            st.setInt(5, p.getQtde());
            st.setString(6, p.getListaTipo());
            st.setString(7, p.getObs());
            
            int resposta = st.executeUpdate();
            if(resposta == 1){
                ConnectionFactory.getConnection().commit();
                return true;
            }else{
                return false;
            }
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro de SQL:" +erro, "Erro de SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
