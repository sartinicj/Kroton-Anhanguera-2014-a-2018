/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fpj.8483182138
 */
public class Contas {
    public static void main(String[] args) {
       ContaBancaria c = new ContaBancaria();
       CPP cp = new CPP();
       CCE ce = new CCE ();
       c.cliente="Gertrudes";
       c.num_conta=123456;
       c.saldo=15746;
       cp.cliente="Destiny";
       cp.d_d_rend=32853265;
       cp.num_conta=256535;
       cp.saldo=548315765;
       ce.cliente="Bell";
       ce.limite=1235;
       ce.num_conta=256317855;
       ce.saldo=83493128;
       c.sacar(60);
       c.depositar(30);
       System.out.println("Seu novo saldo é:"+ c.saldo);
    }
       
               
       
       
       
       
       
    }
}
