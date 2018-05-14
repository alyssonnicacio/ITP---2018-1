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
public class Jogador extends Pessoa{
    
    private String email;

    public Jogador(String email, int cpf, String estado_civil, String nacionalidade, String nome, String data_nascimento, String cor_olhos, String nome_pai, String nome_mae) {
        super(cpf, estado_civil, nacionalidade, nome, data_nascimento, cor_olhos, nome_pai, nome_mae);
        this.email = email;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    
    protected void imprimeDadosJogador(){
        System.out.println("Nome:"+this.getNome());
        System.out.println("Email:"+this.getEmail());
        System.out.println("CPF:"+this.getCpf());
        System.out.println("Estado Civil:"+this.getEstado_civil());
        System.out.println("Nacionalidade:"+this.getNacionalidade());
        System.out.println("Data de Nascimento:"+this.getData_nascimento());
        System.out.println("Cor dos Olhos:"+this.getCor_olhos());
        System.out.println("Nome do Pai:"+this.getNome_pai());
        System.out.println("Nome da Mãe:"+this.getNome_mae());
    }

    public void mensagemVitoria(){
        System.out.println("Venci! O outro jogador é muito noob!");
    }
    
}
