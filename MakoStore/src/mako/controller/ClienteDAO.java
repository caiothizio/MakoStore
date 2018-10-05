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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mako.model.Cliente;

/**
 *
 * @author CaioThizio
 */
public class ClienteDAO implements java.io.Serializable{
    private final static ArrayList <Cliente> listaClientes = new ArrayList<>();
    
    //private BinarioIO binIO;
    
    //private AcessaBD AcessaBD;
    /*
    public ClienteDAO(){
        //this.binIO = new BinarioIO();
        
        //this.AcessaBD = new AcessaBD();
    }
    
    public static final BinarioIO BinarioIO{
        return binIO;
    }
    
    public static final AcessaBD getBanco(){
        return AcessaBD;
    }
    
    public static ArrayList<Cliente> listaClientes{
        return listaClientes;
    }
    */
    public static final Cliente buscaPorNome(String nome){
        for(Cliente c : listaClientes){
            if(c.getNome().equals(nome)){
                return c;
            }
        }
        return null;
    }
    
    public static final Cliente buscaPorId(int id){
        for(Cliente c : listaClientes){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    
    public static final int buscaIndex(String nome){
        for(Cliente c : listaClientes){
            if(c.getNome().equals(nome)){
                return listaClientes.indexOf(c);
            }
        }
        return -1;
    }
    
    public static final String cadastrar(Cliente c){
        try{
            listaClientes.add(c);
        }catch(Exception e){
            return "Erro no cadastro!\n" + e.getMessage();
        }
        return "Cadastro realizado com sucesso!";
    }
    
    public static final String deletar(Cliente c){
        try{
            listaClientes.remove(c);
        }catch(Exception e){
            return "Erro na remoção!\n" + e.getMessage();
        }
        return "Remoção realizada com sucesso!";
    }
    
    public static final String atualizar(int ind, Cliente c){
        try{
            listaClientes.add(ind, c);
        }catch(Exception e){
            return "Erro na atualização!\n" + e.getMessage();
        }
        return "Atualização realizada com sucesso!";
    }
/*
    public static final void leClientes() throws IOException {
        File logTxt = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\cliente\\", "log_cliente.txt");
        FileReader leitor = new FileReader(logTxt);
        try (BufferedReader buffer = new BufferedReader(leitor)) {
            String linha = "-";
            
            while(buffer.ready()){
                if("-".equals(linha)){
                    Cliente c = new Cliente();
                    
                    c.setId(Integer.parseInt(buffer.readLine()));
                    c.setNome(buffer.readLine());
                    c.setEndereco(buffer.readLine());
                    c.setContato(buffer.readLine());
                    c.setCpfcnpj(buffer.readLine());
                    c.setObs(buffer.readLine());
                    listaClientes.add(c);
                    linha = buffer.readLine();
                }
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Erro de leitura: "+e, "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static final void escreveClientes() throws IOException {
        File logTxt = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\cliente\\", "log_cliente.txt");
       
        FileWriter escritor = new FileWriter(logTxt, false);
        try (BufferedWriter buffer = new BufferedWriter(escritor)) {
            for(Cliente c : listaClientes){
                buffer.write(Integer.toString(c.getId()) + "\n" + c.getNome() + "\n" + c.getEndereco() + "\n" + c.getContato() + "\n" + c.getCpfcnpj() + "\n" + c.getObs() + "\n-\n");
            }
            
            buffer.flush();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Erro de escrita: "+e, "Erro de escrita", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static final void escreveClientesBin() throws IOException{
        File logBin = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\cliente\\", "log_cliente.mako");
        ObjectOutputStream escritor = BinarioIO.criarEscritor(logBin, true);
        for(Cliente c : listaClientes){
            BinarioIO.escrever(escritor, c, true);
        }
    }
    
    public static final void imprimeArray(ArrayList<Cliente> array){
        for(Cliente c : array){
            System.out.println(Integer.toString(c.getId()) + "\n" + c.getNome() + "\n" + c.getEndereco() + "\n" + c.getContato() + "\n" + c.getCpfcnpj() + "\n" + c.getObs() + "\n-\n");
        }
    }
    
    public static final void apagarFiles(){
        try{
            File logTxt = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\cliente\\", "log_cliente.txt");
            File logBin = new File("C:\\Users\\caiot\\OneDrive\\Documentos\\Caio\\ProgDesk\\src\\src\\mako\\archive\\cliente\\", "log_cliente.mako");
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
    
    public static final boolean conectaBD(){
        return ConnectionFactory.acessaBD();
    }
    
    public static final boolean adicionarClienteBD(Cliente c){
        try{
            conectaBD();
            String querydados = "insert into mako.cliente" + "(cliente_id, cliente_nome, cliente_endereco, cliente_contato, cliente_cpfcnpj, cliente_obs)" + "values (?, ?, ?, ?, ?, ?);";
            
            PreparedStatement st = ConnectionFactory.getConnection().prepareStatement(querydados);
            
            st.setInt(1, c.getId());
            st.setString(2, c.getNome());
            st.setString(3, c.getEndereco());
            st.setString(4, c.getContato());
            st.setString(5, c.getCpfcnpj());
            st.setString(6, c.getObs());
            
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
