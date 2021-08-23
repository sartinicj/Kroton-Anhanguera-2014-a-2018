/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhanguera.aula6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Fabiano Fernandes
 */
public class JanelaAmarela extends JFrame{
    private Color corJanela = new Color(255,255,200);
    public JanelaAmarela(){
        setTitle("Meu primeiro Programa");
        setSize(800,600);
        getContentPane().setLayout(null);
        getContentPane().setBackground(corJanela);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        centralizar();
    }
    
    private void centralizar(){
        Dimension dt = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dj = this.getSize();
        this.setLocation((dt.width - dj.width)/2, (dt.height - dj.height)/2);
    }
    
    
    public static void main(String[] args) {
        JanelaAmarela j = new JanelaAmarela();
        j.setVisible(true);
        

        
    }
}