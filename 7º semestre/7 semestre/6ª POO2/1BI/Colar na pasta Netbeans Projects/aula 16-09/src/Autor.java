/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aula
 */
public class Autor {
    int codigo;
    private String nome;

public Autor (){}
public Autor (int codigo, String nome){
this.codigo = codigo;
this.nome = nome;

}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    
}
