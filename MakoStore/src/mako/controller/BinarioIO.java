/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author CaioThizio
 */
public class BinarioIO implements java.io.Serializable{
    public static final ObjectOutputStream criarEscritor(File f, boolean append) {
        ObjectOutputStream oos = null;

        try {
            
            if (f.exists()) {
                FileOutputStream fos = new FileOutputStream(f, append);
                oos = new ObjectOutputStream(fos);
            } else {
                FileOutputStream fos = new FileOutputStream(f, append);
                oos = new ObjectOutputStream(fos);
            }
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar arquivo: " + erro, "Erro de criação de arquivo", JOptionPane.ERROR_MESSAGE);
        }
        return oos;
    }
    
    public static final ObjectInputStream criarLeitor(File f) {
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo: " + erro, "Erro de leitura de arquivo", JOptionPane.ERROR_MESSAGE);
        }
        return ois;
    }
     
    public static final void escrever(ObjectOutputStream oos, Object obj, boolean flush) {
        try {
            oos.writeObject(obj);
            if (flush) {
                oos.flush();
            }
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao escrever arquivo: " + erro, "Erro de escrita de arquivo", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    public static final Object ler(ObjectInputStream ois) {
        Object objlido = null;
        try {
            objlido = ois.readObject();
        } catch (ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Classe não encontrada: " + erro, "Erro de classe não encontrada", JOptionPane.ERROR_MESSAGE);
        } catch (java.io.EOFException erro) {
            JOptionPane.showMessageDialog(null, "Fim de arquivo: " + erro, "Erro de final de arquivo", JOptionPane.ERROR_MESSAGE);
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro de leitura de objeto: " + erro, "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        } finally {
            return objlido;
        }
    }
}
