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
public class Mesa {
    private Jogador jogador1;
    private Jogador jogador2;

    public Mesa() {
        this.jogador1 = new Jogador("kayo@teste.com.br",00011122233,"solteiro", "brasileira","Kayo",  "28/03/2000","castanhos","nome do pai","nome da mae");
        this.jogador2 = new Jogador("fulana@teste.com.",00022233344,"solteira", "brasileira","Fulana","20/01/2000","castanhos","nome do pai","nome da mae");
        
    }

    Mesa(Jogador jogador1_, Jogador jogador2_) {
        this.jogador1 = jogador1_;
        this.jogador2 = jogador2_;
    }
    
    public String getNomeJogador1(){
        return this.jogador1.getNome();
    }
    
    public String getNomeJogador2(){
        return this.jogador2.getNome();
    }
    
    public void imprimeDadosJogador1(){
        this.jogador1.imprimeDadosJogador();
    }
    
    public void imprimeDadosJogador2(){
        this.jogador2.imprimeDadosJogador();
    }
    
}
