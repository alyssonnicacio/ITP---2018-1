/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteBlackJack;

/**
 *
 * @author Kayo
 */
public class Humano {
    private String nome;
    private String data_nascimento;
    private String cor_olhos;
    private String nome_pai;
    private String nome_mae;

    public Humano(String nome, String data_nascimento, String cor_olhos, String nome_pai, String nome_mae) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cor_olhos = cor_olhos;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
    }
   
    
    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getData_nascimento() {
        return data_nascimento;
    }

    protected void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    protected String getCor_olhos() {
        return cor_olhos;
    }

    protected void setCor_olhos(String cor_olhos) {
        this.cor_olhos = cor_olhos;
    }

    protected String getNome_pai() {
        return nome_pai;
    }

    protected void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    protected String getNome_mae() {
        return nome_mae;
    }

    protected void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }
    
    
}
