/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.model;

/**
 *
 * @author CaioThizio
 */
public class Cliente implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String nome;
    private String endereco;
    private String contato;
    private String cpfcnpj;
    private String obs;
    
    public Cliente(){
        id = 0;
        nome = "";
        endereco = "";
        contato = "";
        cpfcnpj = "";
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
     * @return the cpfcnpj
     */
    public String getCpfcnpj() {
        return cpfcnpj;
    }

    /**
     * @param cpfcnpj the cpfcnpj to set
     */
    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
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
