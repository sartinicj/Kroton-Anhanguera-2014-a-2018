/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhanguera.aula6;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Fabiano Fernandes
 */
public class JanelaExemplo3 extends JFrame {

    public JanelaExemplo3() {
        
        this.setTitle("Minha terceira Janela");
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        centralizar();
    }
    
    private void centralizar() {
        Dimension dt = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dj = getSize();
        this.setLocation((dt.width - dj.width) / 2, (dt.height - dj.height) / 2);
    }    
    
    
    public static void main(String[] args) {
        new JanelaExemplo3().setVisible(true);
    }
    
    
    
}
