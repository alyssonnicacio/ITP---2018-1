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
public class Pessoa extends Humano{
    
    private int cpf;
    private String estado_civil;
    private String nacionalidade;
        
    public Pessoa(int cpf, String estado_civil, String nacionalidade, String nome, String data_nascimento, String cor_olhos, String nome_pai, String nome_mae) {
        super(nome, data_nascimento, cor_olhos, nome_pai, nome_mae);
        this.cpf = cpf;
        this.estado_civil = estado_civil;
        this.nacionalidade = nacionalidade;
    }
    
    protected int getCpf() {
        return cpf;
    }

    protected void setCpf(int cpf) {
        this.cpf = cpf;
    }

    protected String getEstado_civil() {
        return estado_civil;
    }

    protected void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    protected String getNacionalidade() {
        return nacionalidade;
    }

    protected void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void mensagemVitoria(){
        System.out.println("Venci!!!");
    }
    
       
}
