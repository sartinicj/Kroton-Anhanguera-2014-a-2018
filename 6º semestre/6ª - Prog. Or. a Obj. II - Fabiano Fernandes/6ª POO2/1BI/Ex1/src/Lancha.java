/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aula
 */
public class Lancha extends Veiculos {
    private int numMotores;
    
    public void dados(){
        System.out.println("*******LANCHA*******\n"+"Numero de motores: "+this.numMotores);
        super.dados();
        
    }
    
      public Lancha(){
      }
      public Lancha(String modelo, int numLugares, int ano, String cor, int comprimento,int numMotores){
      this.numMotores=numMotores;
      super.modelo=modelo;
      super.ano=ano;
      super.cor=cor;
      super.comprimento=comprimento;
      super.numLugares=numLugares;
      }
    /**
     * @return the numMotores
     */
    public int getNumMotores() {
        return numMotores;
    }

    /**
     * @param numMotores the numMotores to set
     */
    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }
    
}
