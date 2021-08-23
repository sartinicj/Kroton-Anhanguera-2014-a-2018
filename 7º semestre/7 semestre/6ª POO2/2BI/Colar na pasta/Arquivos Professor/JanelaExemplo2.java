/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhanguera.aula6;

import javax.swing.JFrame;

/**
 *
 * @author Fabiano Fernandes
 */
public class JanelaExemplo2 {
    
    public JanelaExemplo2(){
        JFrame j = new JFrame();
        j.setTitle("Minha segunda Janela");
        j.setSize(800,600);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);        
    }
    
    public static void main(String[] args) {
        new JanelaExemplo2();
    }
    
}
