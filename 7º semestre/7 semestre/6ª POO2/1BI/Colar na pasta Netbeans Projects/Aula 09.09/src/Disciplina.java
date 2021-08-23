/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fpj.8483182138
 */
public class Disciplina {
    int codigo;
    String descricao;
    
    public Disciplina(){};
    public int getCodigo(){return this.codigo;}
    public String getDescricao(){return this.descricao;}
    public void setCodigo (int codigo){
    if (codigo<0){
        System.out.println("Digite um número natural!!");
    }
}
    public void setDescricao (String descricao){
    if (descricao.length() <5 || descricao.length() > 50){
        System.out.println("Digite um numero entr 5 e 50!!!");
    } else
        this.descricao = descricao;
    }
            }
    
