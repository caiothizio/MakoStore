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
import javax.swing.JOptionPane;
import mako.model.Cliente;
import mako.model.Venda;

/**
 *
 * @author caiot
 */
public class VendaDAO {
    public static final ResultSet getAllVendas(){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select venda_id, cliente_nome, produto_nome, venda_obs, venda_qtd, venda_preco from mako.venda v, mako.cliente c, mako.produto p where v.v_cliente_id = c.cliente_id and v.v_produto_id = p.produto_id order by venda_id"));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final ResultSet getVendaById(String id){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select venda_id, cliente_nome, produto_nome, venda_obs, venda_qtd, venda_preco from mako.venda v, mako.cliente c, mako.produto p where v.v_cliente_id = c.cliente_id and v.v_produto_id = p.produto_id and v.venda_id = "+id));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final boolean newVenda(Venda v){
        try{
            ConnectionFactory.acessaBD();
            String querydados = "insert into mako.venda" + "(venda_id, v_cliente_id, v_produto_id, venda_obs, venda_qtd, venda_preco)" + "values (?, ?, ?, ?, ?, ?);";
            
            PreparedStatement st = ConnectionFactory.getConnection().prepareStatement(querydados);
            
            st.setInt(1, v.getId());
            st.setInt(2, v.getCliente_id());
            st.setInt(3, v.getProduto_id());
            st.setString(4, v.getObs());
            st.setInt(5, v.getQtd());
            st.setDouble(6, v.getPreco());
            
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
    
    public static final boolean deleteVenda(String id){
        try{
            ConnectionFactory.acessaBD();
            
            String query = "delete from mako.venda where venda_id = ?";
            
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
    
    public static final boolean updateVenda(String id, int cId, int pId, String obs, String qtd, String preco, String oldId){
        try{
            ConnectionFactory.acessaBD();
            
            String query = "update mako.venda set venda_id = ?, v_cliente_id = ?, v_produto_id = ?, venda_obs = ?, venda_qtd = ?, venda_preco = ? where venda_id = ?";
            
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(query);
            
            stmt.setInt(1, Integer.parseInt(id));
            stmt.setInt(2, cId);
            stmt.setInt(3, pId);
            stmt.setString(4, obs);
            stmt.setInt(5, Integer.parseInt(qtd));
            stmt.setDouble(6, Double.valueOf(preco));
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
