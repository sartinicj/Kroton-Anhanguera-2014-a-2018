/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aula
 */
public class Ex1 {
    public static void main(String[] args) {
        
        
        
        Carro car =new Carro("Astra",3,2003,"Roxo",5,4,"DCS-1523");
        
        Lancha l=new Lancha("Lynx",5,2014,"Vermelho",6,2);
        
        Aviao av=new Aviao("Ultraleve",600,2000,"Verde",5000,"AXL",20);
        
        av.mostrar();
        
        car.mostrar();
        
        l.mostrar();
    }

    
}
