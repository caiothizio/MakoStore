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
import mako.model.Produto;

/**
 *
 * @author caiot
 */
public class ProdutoDAO {
    public static final ResultSet getAllProdutos(){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select * from mako.produto order by produto_id"));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final ResultSet getProdutoById(String id){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select * from mako.produto where produto_id = "+id));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final ResultSet getProdutoByName(String nome){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select * from mako.produto where produto_nome = '"+nome+"'"));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final boolean newProduto(Produto p){
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
    
    public static final boolean deleteProduto(String id){
        try{
            ConnectionFactory.acessaBD();
            
            String query = "delete from mako.produto where produto_id = ?";
            
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
    
    public static boolean updateProduto(String id, String nome, String precocusto, String precorevenda, String qtde, String tipo, String obs, String oldId) {
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
