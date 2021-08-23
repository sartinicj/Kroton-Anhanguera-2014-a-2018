
import java.util.List;

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
public class Estudo_de_caso {
    public static void main(String[] args) {
       //  Livro L = new Livro (8, "Java Como Programar", 2009, new Editora (10,"Camelo"));
       List <Livro> biblioteca = new ArrayList<Livro>();
       biblioteca.add(new Livro (8, "Java Como Programar", 2009, new Editora (10,"Camelo")));
       biblioteca.add(new Livro (7, "Letras Mágicas", 2015, new Editora (11, "Cato")));
       biblioteca.add(new Livro (56, "Consolees", 2010, new Editora (5, "Giohs")));
       
       biblioteca.get(0).icluirAutor(new Autor(10,"Sabrina"));
       biblioteca.get(1).icluirAutor(new Autor(12,"Linda"));
       
       for ((Livro L: biblioteca)){
        System.out.println(L);
        ListInterator la = L.getAutorIterator();
        while (la.hasNext()){
            System.out.println(la.next.getNome());
        }
}
            
    }
}
