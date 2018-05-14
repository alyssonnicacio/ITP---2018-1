/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteBlackJack;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Kayo
 */
public class Baralho {
   private List<Carta> cartas;

    Baralho(){
        cartas = new ArrayList<Carta>(); //cria lista para 'cartas'
        
        String numero = "0";
        String naipe = "fake";
        int valor = 0;
        
        for (int num=1; num<14; num++){
            for (int naip=1; naip<5; naip++){
                Carta c = new Carta(); //cria carta
                //verifica numero
                if (num==1){
                    numero="A";
                    valor=1;
                }
                else if (num==11){
                    numero="J";
                    valor=11;
                }
                else if (num==12){
                    numero="Q";
                    valor=12;
                }
                else if (num==13){
                    numero="K";
                    valor=13;
                }
                else{
                    numero = String.valueOf(num);
                    valor = num;
                }
                
                //verifica naipe
                switch (naip) {
                    case 1:  naipe = "Paus"; break;
                    case 2:  naipe = "Ouros"; break;
                    case 3:  naipe = "Copas";  break;
                    case 4:  naipe = "Espadas"; break;
                    default: naipe = "fake"; break;
                }
                //seta a carta
                c.setNumero(numero);
                c.setNaipe(naipe);
                c.setValor(valor);
                
                //Adiciona a carta no baralho
                this.cartas.add(c);
            }
        }
    }
    
    public void listarCartas(){
        for (Carta c : this.cartas) 
            System.out.println(c.getNumero() +" de "+c.getNaipe() +". Valor: "+ c.getValor());
    }
    
    protected void embaralhar(){
        Random random = new Random();
        Carta carta = new Carta();
        ArrayList<Carta> listaEmbaralhada = new ArrayList<Carta>();
        
        for (int i = 0; i < 52; i++){
            listaEmbaralhada.add(cartas.remove(random.nextInt(cartas.size())) );
        }
        cartas = listaEmbaralhada;
    
    }
    
}




