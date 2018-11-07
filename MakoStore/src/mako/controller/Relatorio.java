/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.controller;

import mako.model.ConnectionFactory;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author caiot
 */
public class Relatorio {

    private static final String relatorioClientes = System.getProperty("user.dir") + "\\build\\classes\\mako\\archive\\reports\\Clientes.jasper";
    private static final String relatorioFornecedores = System.getProperty("user.dir") + "\\build\\classes\\mako\\archive\\reports\\Fornecedores.jasper";
    private static final String relatorioProdutos = System.getProperty("user.dir") + "\\build\\classes\\mako\\archive\\reports\\Produtos.jasper";

    private static boolean isNumeric(String s) {  
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
    }
    
    public static final void mostraRelatorioClientes() {
        Map params = new HashMap();
        String s = null;
        
        JasperPrint impressao;
        try {
            if (ConnectionFactory.getConnection() == null) {
                ConnectionFactory.acessaBD();
            }

            impressao = JasperFillManager.fillReport(relatorioClientes, params, ConnectionFactory.getConnection());
            JasperViewer.viewReport(impressao, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar relatorio de clientes: " + e.getMessage(), "Erro de visualização", 0);
            e.printStackTrace();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Algum parametro da funcao é nulo: " + e.getMessage(), "Erro de visualização", 0);
        } finally {
            try {
                ConnectionFactory.getConnection().close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar connection: " + e.getMessage(), "Erro de conexão", 0);
            }
        }
    }

    public static final void mostraRelatorioFornecedores() {
        Map params = new HashMap();
        String s = null;

        while (true) {
            s = JOptionPane.showInputDialog("Digite o ID do fornecedor");
            if (!isNumeric(s)) {
                JOptionPane.showMessageDialog(null, "Erro! ID inválido.");
            } else {
                break;
            }
        }
        params.put("id", Integer.parseInt(s));
        
        JasperPrint impressao;
        try {
            if (ConnectionFactory.getConnection() == null) {
                ConnectionFactory.acessaBD();
            }

            impressao = JasperFillManager.fillReport(relatorioFornecedores, params, ConnectionFactory.getConnection());
            JasperViewer.viewReport(impressao, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar relatorio de fornecedores: " + e.getMessage(), "Erro de visualização", 0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Algum parametro da funcao é nulo: " + e.getMessage(), "Erro de visualização", 0);
        } finally {
            try {
                ConnectionFactory.getConnection().close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar connection: " + e.getMessage(), "Erro de conexão", 0);
            }
        }
    }

    public static final void mostraRelatorioProdutos() {
        Map params = new HashMap();
        String s = null;

        while (true) {
            s = JOptionPane.showInputDialog("Digite o ID do produto");
            if (!isNumeric(s)) {
                JOptionPane.showMessageDialog(null, "Erro! ID inválido.");
            } else {
                break;
            }
        }
        params.put("id", Integer.parseInt(s));
        
        JasperPrint impressao;
        try {
            if (ConnectionFactory.getConnection() == null) {
                ConnectionFactory.acessaBD();
            }

            impressao = JasperFillManager.fillReport(relatorioProdutos, params, ConnectionFactory.getConnection());
            JasperViewer.viewReport(impressao, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar relatorio de produtos: " + e.getMessage(), "Erro de visualização", 0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Algum parametro da funcao é nulo: " + e.getMessage(), "Erro de visualização", 0);
        } finally {
            try {
                ConnectionFactory.getConnection().close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar connection: " + e.getMessage(), "Erro de conexão", 0);
            }
        }
    }
}
