/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aula
 */
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

public class Livro {
      private int codigo;
      private String titulo;
      private int ano;
      private Editora editora;
      private List<Autor> autores;
      
  public Livro (int codigo, String titulo, int ano, Editora editora){
      this.codigo =  codigo;
      this.titulo = titulo;
      this.ano = ano;
      this.editora = editora;
      this.autores = new ArrayList <Autor> (); 
            
  }
    
    @Override
    public String toString() {
        return ""+this.codigo+"-"+this.titulo+"-"+this.ano+"-"+editora.getNome()+"";
    }
        
    public void incluirAutor (Autor autor){
        this.autores.add(autor);
     }
    public ListIterator<Autor> getAutorIterator( ){
    return autores.listIterator();

    }
}
