/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.controller;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author caiot
 */
public class AcessaBD implements java.io.Serializable{

    
    public static final ResultSet executaQuery(String query){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery(query));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final boolean executaDelete(String id, String tabela){
        try{
            ConnectionFactory.acessaBD();
            
            String query = "delete from mako."+tabela+" where "+tabela+"_id = ?";
            
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
}
