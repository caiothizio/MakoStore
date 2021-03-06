/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.controller;

import mako.model.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mako.model.Cliente;

/**
 *
 * @author caiot
 */
public class ClienteDAO {
    public static final ResultSet getAllClientes(){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select * from mako.cliente order by cliente_id"));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final ArrayList<String> getAllClientesArray() {
        ResultSet clientes = getAllClientes();
        
        ArrayList<String> clientesArray = new ArrayList<>();
        try {
            while(clientes.next()){
                clientesArray.add(clientes.getString("cliente_nome"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return clientesArray;
    }
    
    public static final ResultSet getClienteById(String id){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select * from mako.cliente where cliente_id = "+id));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final int getIdByName(String name){
        ResultSet cliente = getClienteByName(name);
        
        try {
            if(cliente.next()){
                return cliente.getInt("cliente_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;
    }
    
    public static final ResultSet getClienteByName(String nome){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select * from mako.cliente where cliente_nome = '"+nome+"'"));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final boolean newCliente(Cliente c){
        try{
            ConnectionFactory.acessaBD();
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
    
    public static final boolean deleteCliente(String id){
        try{
            ConnectionFactory.acessaBD();
            
            String query = "delete from mako.cliente where cliente_id = ?";
            
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(query);
        
            stmt.setInt(1, Integer.parseInt(id));
            
            int i = stmt.executeUpdate();

            ConnectionFactory.getConnection().commit();
            ConnectionFactory.getConnection().close();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar delete: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
       
    }
    
    public static final boolean updateCliente(String id, String nome, String endereco, String contato, String cpfcnpj, String obs, String oldId){
        try{
            ConnectionFactory.acessaBD();
            
            String query = "update mako.cliente set cliente_id = ?, cliente_nome = ?, cliente_endereco = ?, cliente_contato = ?, cliente_cpfcnpj = ?, cliente_obs = ? where cliente_id = ?";
            
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(query);
            
            stmt.setInt(1, Integer.parseInt(id));
            stmt.setString(2, nome);
            stmt.setString(3, endereco);
            stmt.setString(4, contato);
            stmt.setString(5, cpfcnpj);
            stmt.setString(6, obs);
            stmt.setInt(7, Integer.parseInt(oldId));
            
            int i = stmt.executeUpdate();

            ConnectionFactory.getConnection().commit();
            ConnectionFactory.getConnection().close();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar update: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
       
    }
}
