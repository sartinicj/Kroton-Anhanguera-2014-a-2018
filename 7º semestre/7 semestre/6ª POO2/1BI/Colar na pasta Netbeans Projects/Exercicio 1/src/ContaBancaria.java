/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fpj.8483182138
 */
public class ContaBancaria {
        String cliente;
    int num_conta;
    double saldo;
    
public void sacar (int sac){
    this.saldo=this.saldo-sac;
    }
public void depositar(int dep){
    this.saldo=this.saldo+dep;
    
}
}
