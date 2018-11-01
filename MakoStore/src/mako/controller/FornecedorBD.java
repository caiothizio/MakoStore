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
public class FornecedorBD {
        public static final boolean executaUpdateFornecedor(String id, String nome, String endereco, String contato, String pagina, String tipo, String tipoPes, String obs, String oldId){
        try{
            ConnectionFactory.acessaBD();
            
            String query = "update mako.fornecedor set fornecedor_id = ?, fornecedor_nome = ?, fornecedor_endereco = ?, fornecedor_contato = ?, fornecedor_pagina = ?, fornecedor_tipo = ?, fornecedor_tipopes = ?, fornecedor_obs = ? where fornecedor_id = ?";
            
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(query);
            
            stmt.setInt(1, Integer.parseInt(id));
            stmt.setString(2, nome);
            stmt.setString(3, endereco);
            stmt.setString(4, contato);
            stmt.setString(5, pagina);
            stmt.setString(6, tipo);
            stmt.setString(7, tipoPes);
            stmt.setString(8, obs);
            stmt.setInt(9, Integer.parseInt(oldId));
            
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
