/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aula
 */
public class Principal {
    public static void main(String[] args) {
        Carro car =new Carro("Fusca",3,2009,"Vermelho",5,4,"BHL9520");
        Aviao avi=new Aviao("BOING",600,2010,"Branco",5000,"AXL",20);
        Lancha lan=new Lancha("Sonic",5,2014,"Roxo",6,2);
        car.dados();
        avi.dados();
        lan.dados();
    }

    
}
