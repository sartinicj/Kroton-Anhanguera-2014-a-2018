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
public class Main {
     public static void main(String[] args) {
          List <Estado> es = new ArrayList<Estado>();
          es.add(new Estado("SP"+"Jundiai"+"44,04mi"));
          es.add(new Estado("MG"+"Extrema"+"20,87mi"));
          es.add(new Estado("RJ"+"Sao Gonçalo"+"16,46mi"));
          
          es.get(0).icluirEstado(new Estado());
          es.get(1).icluirEstado(new Estado());
     }
}

for ((Estado es: es)){
        System.out.println(es);
        ListInterator la = L.getEstadoIterator();
        while (la.hasNext()){
            System.out.println(la.next.getNome());
        }

