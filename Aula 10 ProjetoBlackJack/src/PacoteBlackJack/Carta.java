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
public class Carta {
    private String numero;
    private String naipe;
    private int valor;

    Carta(){
        this.numero="0";
        this.naipe="fake";
        this.valor=0;
    }

    public Carta(String numero_, String naipe_, int valor_) {
        this.numero = numero_;
        this.naipe = naipe_;
        this.valor = valor_;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
          
    
}
