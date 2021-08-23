/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aula
 */
public class Veiculos {
    String modelo;
    int numLugares;
    int ano;
    String cor;
    int comprimento;
    
    public void dados(){
        System.out.println("Modelo: "+this.modelo+"\nNumero de lugares: "+this.numLugares+"\nAno: "+this.ano+"\nCor: "+this.cor+"\nComprimento: "+this.comprimento);
    }

    public Veiculos(){}
    public Veiculos(String modelo, int numLugares, int ano, String cor, int comprimento){
    this.modelo=modelo;
    this.numLugares=numLugares;
    this.ano=ano;
    this.cor=cor;
    this.comprimento=comprimento;
    
    }
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the comprimento
     */
    public int getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
}
