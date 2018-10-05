/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author caiot
 */
public class ConnectionFactory {
    private static Connection connection = null;
    private static Statement stdados = null;
    private static ResultSet rsdados = null;
    
    public static final boolean acessaBD(){  
        try {
            String usuario = "postgres";
            String senha = "1602";
            
            Class.forName("org.postgresql.Driver");
            String urlconexao = "jdbc:postgresql://localhost/Mako";

            setConnection(DriverManager.getConnection(urlconexao, usuario, senha));
            
            getConnection().setAutoCommit(false);

        } catch (ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao carregar o driver JDBC/ODBC:" +erro, "Erro de carregamento de driver", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de SQL:" +erro, "Erro de SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * @return the connection
     */
    public static Connection getConnection() {
        return connection;
    }

    /**
     * @return the stdados
     */
    public static Statement getStdados() {
        return stdados;
    }

    /**
     * @return the rsdados
     */
    public static ResultSet getRsdados() {
        return rsdados;
    }

    /**
     * @param aConnection the connection to set
     */
    public static void setConnection(Connection aConnection) {
        connection = aConnection;
    }

    /**
     * @param aStdados the stdados to set
     */
    public static void setStdados(Statement aStdados) {
        stdados = aStdados;
    }

    /**
     * @param aRsdados the rsdados to set
     */
    public static void setRsdados(ResultSet aRsdados) {
        rsdados = aRsdados;
    }
}
