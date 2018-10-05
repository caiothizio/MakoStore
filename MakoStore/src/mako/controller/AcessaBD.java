/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.controller;

import java.sql.*;
import javax.swing.JOptionPane;
import mako.view.CadastroCliente;

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
