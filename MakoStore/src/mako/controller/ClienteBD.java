/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author caiot
 */
public class ClienteBD {
    public static final boolean executaUpdateCliente(String id, String nome, String endereco, String contato, String cpfcnpj, String obs, String oldId){
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
