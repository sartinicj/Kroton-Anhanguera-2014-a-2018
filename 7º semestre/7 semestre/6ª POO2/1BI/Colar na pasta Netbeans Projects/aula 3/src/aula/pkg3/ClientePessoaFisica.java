/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg3;

/**
 *
 * @author aula
 */
public class ClientePessoaFisica extends Cliente{
    String cpf;
    String nome;
    String nascimento;
    
    public ClientePessoaFisica (){} 
    public ClientePessoaFisica (String nome){}
    public ClientePessoaFisica (String nome, String cpf){}
   public void exibirDados(){
       System.out.println("nome "+this.nome);
       System.out.println("cpf "+this.cpf);
       System.out.println("nascimento "+this.nascimento);
       super.exibirDados();
   }
}


