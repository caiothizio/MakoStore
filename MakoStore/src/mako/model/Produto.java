    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.model;

import java.util.ArrayList;
import mako.controller.ProdutoDAO;

/**
 *
 * @author CaioThizio
 */
public class Produto implements java.io.Serializable{
    
    private int id;
    private String nome;
    private double precoCusto;
    private double precoRevenda;
    private int qtde;
    private String listaTipo;
    private String obs;
    
    public Produto(){
        id = 0;
        nome = "";
        precoCusto = 0.0;
        precoRevenda = 0.0;
        qtde = 0;
        listaTipo = "";
        obs = "";
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the precoCusto
     */
    public double getPrecoCusto() {
        return precoCusto;
    }

    /**
     * @param precoCusto the precoCusto to set
     */
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    /**
     * @return the precoRevenda
     */
    public double getPrecoRevenda() {
        return precoRevenda;
    }

    /**
     * @param precoRevenda the precoRevenda to set
     */
    public void setPrecoRevenda(double precoRevenda) {
        this.precoRevenda = precoRevenda;
    }

    /**
     * @return the qtde
     */
    public int getQtde() {
        return qtde;
    }

    /**
     * @param qtde the qtde to set
     */
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /**
     * @return the listaTipo
     */
    public String getListaTipo() {
        return listaTipo;
    }

    /**
     * @param listaTipo the listaTipo to set
     */
    public void setListaTipo(String listaTipo) {
        this.listaTipo = listaTipo;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

  
}
