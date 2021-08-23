/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhanguera.aula6;

/**
 *
 * @author Fabiano Fernandes
 */
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.*;

public class JanelaCadastro extends JanelaAmarela {
  private JButton btGravar;
  private JButton btSair;
  private JPanel pnEsquerda;
  private JPanel pnDireita;
  private JPanel pnRodape;
  
  public JanelaCadastro( ) {
      
    Color corJanelaCadastro = new Color(156,254,129);      
   
    pnDireita = new JPanel( );
    pnDireita.setLayout(null);
    pnDireita.setBounds(10,10,200,450);
    pnDireita.setBackground(corJanelaCadastro);
    
    pnEsquerda = new JPanel( );
    pnEsquerda.setLayout(null);
    pnEsquerda.setBounds(220,10,550,450);
    pnEsquerda.setBackground(corJanelaCadastro);    
    
    
    pnRodape = new JPanel( );
    pnRodape.setLayout(null);
    pnRodape.setBounds(10,470,760,80);
    pnRodape.setBackground(corJanelaCadastro);
    
    btGravar = new JButton("Gravar");
    btGravar.setBounds(290, 25, 100, 33);
    pnRodape.add(btGravar);
    
    btSair = new JButton("Sair");
    btSair.setBounds(400, 25, 100, 33);    
    pnRodape.add(btSair);
   

    this.add(pnEsquerda);
    this.add(pnDireita);
    this.add(pnRodape);    
  
  }
  
  public static void main(String[] args) {
    new JanelaCadastro( ).setVisible(true);
  }
}