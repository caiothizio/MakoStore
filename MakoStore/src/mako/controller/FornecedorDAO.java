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
import javax.swing.JOptionPane;
import mako.model.Fornecedor;

/**
 *
 * @author caiot
 */
public class FornecedorDAO {
    public static final ResultSet getAllFornecedores(){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select * from mako.fornecedor order by fornecedor_id"));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final ResultSet getFornecedorById(String id){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select * from mako.fornecedor where fornecedor_id = "+id));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final ResultSet getFornecedorByName(String nome){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select * from mako.fornecedor where fornecedor_nome = '"+nome+"'"));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public final static boolean newFornecedor(Fornecedor f) {
        try {
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
            if (resposta == 1) {
                ConnectionFactory.getConnection().commit();
                return true;
            } else {
                return false;
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de SQL:" + erro, "Erro de SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static final boolean deleteFornecedor(String id){
        try{
            ConnectionFactory.acessaBD();
            
            String query = "delete from mako.fornecedor where fornecedor_id = ?";
            
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

    public static final boolean updateFornecedor(String id, String nome, String endereco, String contato, String pagina, String tipo, String tipoPes, String obs, String oldId) {
        try {
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar update: " + e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }
}
