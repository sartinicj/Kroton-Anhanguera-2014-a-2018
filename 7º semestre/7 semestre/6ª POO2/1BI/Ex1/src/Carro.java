/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aula
 */
public class Carro extends Veiculos{
    private int numPortas;
    private String placa;
    
    public void dados(){
        System.out.println("*******CARRO*******\n"+"Numero de portas: "+this.numPortas+"\nNumero da placa: "+this.placa);
        super.dados();
    }

    public Carro(){}
    public Carro(String modelo, int numLugares, int ano, String cor, int comprimento,int numPortas,String placa){
    super.numLugares=numLugares;
    this.numPortas=numPortas;
    this.placa=placa;
    super.modelo=modelo;
    super.ano=ano;
    super.cor=cor;
    super.comprimento=comprimento;
    }
    /**
     * @return the numLugares
     */
    public int getNumLugares() {
        return numLugares;
    }

    /**
     * @param numLugares the numLugares to set
     */
    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }

    /**
     * @return the numPortas
     */
    public int getNumPortas() {
        return numPortas;
    }

    /**
     * @param numPortas the numPortas to set
     */
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
