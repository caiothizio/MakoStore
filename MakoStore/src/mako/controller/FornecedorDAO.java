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
import mako.model.Cliente;
import mako.model.Fornecedor;

/**
 *
 * @author CaioThizio
 */
public class FornecedorDAO implements java.io.Serializable{
    private final static ArrayList <Fornecedor> listaFornecedores = new ArrayList<>();;
    
 
    public final static Fornecedor buscaPorNome(String nome){
        for(Fornecedor f : listaFornecedores){
            if(f.getNome().equals(nome)){
                return f;
            }
        }
        return null;
    }
    
    public final static Fornecedor buscaPorId(int id){
        for(Fornecedor f : listaFornecedores){
            if(f.getId() == id){
                return f;
            }
        }
        return null;
    }
    
    public final static int buscaIndex(String nome){
        for(Fornecedor f : listaFornecedores){
            if(f.getNome().equals(nome)){
                return listaFornecedores.indexOf(f);
            }
        }
        return -1;
    }
    
    public final static String cadastrar(Fornecedor f){
        try{
            listaFornecedores.add(f);
        }catch(Exception e){
            return "Erro no cadastro!\n" + e.getMessage();
        }
        return "Cadastro realizado com sucesso!";
    }
    
    public final static String deletar(Fornecedor f){
        try{
            listaFornecedores.remove(f);
        }catch(Exception e){
            return "Erro na remoção!\n" + e.getMessage();
        }
        return "Remoção realizada com sucesso!";
    }
    
    public final static String atualizar(int ind, Fornecedor f){
        try{
            listaFornecedores.add(ind, f);
        }catch(Exception e){
            return "Erro na atualização!\n" + e.getMessage();
        }
        return "Atualização realizada com sucesso!";
    }
    /*
    public final static void leFornecedores() throws IOException {
        File log = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\fornecedor\\", "log_fornecedor.txt");
        FileReader leitor = new FileReader(log);
        try (BufferedReader buffer = new BufferedReader(leitor)) {
            String linha = "-";
            
            while(buffer.ready()){
                if("-".equals(linha)){
                    Fornecedor f = new Fornecedor();
                    
                    f.setId(Integer.parseInt(buffer.readLine()));
                    f.setNome(buffer.readLine());
                    f.setEndereco(buffer.readLine());
                    f.setContato(buffer.readLine());
                    f.setPagina(buffer.readLine());
                    f.setTipo(buffer.readLine());
                    f.setTipoPes(buffer.readLine());
                    f.setObs(buffer.readLine());
                    listaFornecedores.add(f);
                    linha = buffer.readLine();
                }
            }
        }
    }

    public final static void escreveFornecedores() throws IOException {
        File log = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\fornecedor\\", "log_fornecedor.txt");
        FileWriter escritor = new FileWriter(log, false);
        try (BufferedWriter buffer = new BufferedWriter(escritor)) {
            for(Fornecedor f : listaFornecedores){
                buffer.write(Integer.toString(f.getId()) + "\n" + f.getNome() + "\n" + f.getEndereco() + "\n" + f.getContato() + "\n" + f.getPagina() + "\n" + f.getTipo() + "\n" + f.getTipoPes() + "\n"  + f.getObs() + "\n-\n");
            }
            
            buffer.flush();
        }
    }
    
    public final static void escreveFornecedoresBin() throws IOException{
        File logBin = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\cliente\\", "log_fornecedor.mako");
        ObjectOutputStream escritor = BinarioIO.criarEscritor(logBin, false);
        for(Fornecedor f : listaFornecedores){
            BinarioIO.escrever(escritor, f, true);
        }
    }
    
    public final static void apagarFiles(){
        try{
            File logTxt = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\fornecedor\\", "log_fornecedor.txt");
            File logBin = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\fornecedor\\", "log_fornecedor.mako");
            FileWriter escritor = new FileWriter(logTxt, false);
            ObjectOutputStream escritorBin = BinarioIO.criarEscritor(logBin, false);
            BufferedWriter buffer = new BufferedWriter(escritor);
            
            buffer.write("");
            BinarioIO.escrever(escritorBin, "", true);
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Erro ao apagar arquivos: "+e, "Erro de remoção", JOptionPane.ERROR_MESSAGE);
        }
    }
    */
    public final static boolean adicionarFornecedorBD(Fornecedor f){
        try{
            ConnectionFactory.acessaBD();
            String querydados = "insert into mako.fornecedor" + "(fornecedor_id, fornecedor_nome, fornecedor_endereco, fornecedor_contato, fornecedor_pagina, fornecedor_tipo, fornecedor_tipopes, fornecedor_obs)" + "values (?, ?, ?, ?, ?, ?, ?, ?);";
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            PreparedStatement st = ConnectionFactory.getConnection().prepareStatement(querydados);
            
            st.setInt(1, f.getId());
            st.setString(2, f.getNome());
            st.setString(3, f.getEndereco());
            st.setString(4, f.getContato());
            st.setString(5, f.getPagina());
            st.setString(6, f.getTipo());
            st.setString(7, f.getTipoPes());
            st.setString(8, f.getObs());
            
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
