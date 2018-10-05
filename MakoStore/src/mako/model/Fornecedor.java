/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.model;

import mako.controller.FornecedorDAO;

/**
 *
 * @author CaioThizio
 */
public class Fornecedor implements java.io.Serializable{
    private int id;
    private String nome;
    private String endereco;
    private String contato;
    private String pagina;
    private String tipo;
    private String tipoPes;
    private String obs;

    public Fornecedor(){
        id = 0;
        nome = "";
        endereco = "";
        contato = "";
        pagina = "";
        tipo = "";
        tipoPes = "";
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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the contato
     */
    public String getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * @return the pagina
     */
    public String getPagina() {
        return pagina;
    }

    /**
     * @param pagina the pagina to set
     */
    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the tipoPes
     */
    public String getTipoPes() {
        return tipoPes;
    }

    /**
     * @param tipoPes the tipoPes to set
     */
    public void setTipoPes(String tipoPes) {
        this.tipoPes = tipoPes;
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
