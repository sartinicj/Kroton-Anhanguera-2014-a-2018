/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aula
 */
public class Aviao extends Veiculos{
     private String prefixo;
    private int numTurbinas;

    public void dados(){
        System.out.println("*******AVIAO*******\n"+"Prefixo: "+this.prefixo+"\nNumero de turbinas: "+this.numTurbinas);
        super.dados();
    }
    
    public Aviao(){}

    public Aviao(String modelo, int numLugares, int ano, String cor, int comprimento,String prefixo,int numTurbinas){
    this.prefixo=prefixo;
    this.numTurbinas=numTurbinas;
    super.modelo=modelo;
    super.ano=ano;
    super.cor=cor;
    super.comprimento=comprimento;
    super.numLugares=numLugares;
    }
    /**
     * @return the prefixo
     */
    public String getPrefixo() {
        return prefixo;
    }

    /**
     * @param prefixo the prefixo to set
     */
    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    /**
     * @return the numTurbinas
     */
    public int getNumTurbinas() {
        return numTurbinas;
    }

    /**
     * @param numTurbinas the numTurbinas to set
     */
    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }
}
