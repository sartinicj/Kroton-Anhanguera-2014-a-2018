/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aula
 */
public class Funcionario {
    int nome;
    int dep;
    double salario;
    String entrada;
    String rg;
    int numfalta;
    
public double recebeAumento (double salario){
    double au=0;
    return au;
}
public double GanhoAnual (){
    return salario*12;    
}
public double JurosporFalta (){
    return salario*numfalta*0.10;
}
public double recebeBonus (){
 return salario+(salario*0.10);
}
 
}  
