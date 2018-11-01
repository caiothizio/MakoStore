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
public class ProdutoBD {
    public static boolean executaUpdateProduto(String id, String nome, String precocusto, String precorevenda, String qtde, String tipo, String obs, String oldId) {
        try{
            ConnectionFactory.acessaBD();
            
            String query = "update mako.produto set produto_id = ?, produto_nome = ?, produto_precocusto = ?, produto_precorevenda = ?, produto_qtde = ?, produto_tipo = ?, produto_obs = ? where produto_id = ?";
            
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(query);
            
            stmt.setInt(1, Integer.parseInt(id));
            stmt.setString(2, nome);
            stmt.setDouble(3, Double.parseDouble(precocusto));
            stmt.setDouble(4, Double.parseDouble(precorevenda));
            stmt.setInt(5, Integer.parseInt(qtde));
            stmt.setString(6, tipo);
            stmt.setString(7, obs);
            stmt.setInt(8, Integer.parseInt(oldId));
            
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
