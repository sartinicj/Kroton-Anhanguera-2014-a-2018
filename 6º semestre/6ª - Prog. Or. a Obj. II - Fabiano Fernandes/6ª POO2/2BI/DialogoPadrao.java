/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhanguera.aula7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.UIManager;

/**
 *
 * @author Fabiano Fernandes
 */
public class DialogoPadrao extends JFrame implements ActionListener {

    private JButton btMensagem;
    private JButton btConfirmacao;
    private JButton btEntrada;
    private JButton btOpcao;
    private JLabel lbResposta;

    public DialogoPadrao() {
        setTitle("Diálogos padronizados");
        setSize(500, 130);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        this.setLocationRelativeTo(null);

        btMensagem = new JButton("Mensagem");
        btMensagem.setBounds(10, 10, 100, 30);
        this.add(btMensagem);

        btConfirmacao = new JButton("Confirmação");
        btConfirmacao.setBounds(120, 10, 120, 30);
        this.add(btConfirmacao);

        btEntrada = new JButton("Entrada");
        btEntrada.setBounds(250, 10, 100, 30);
        this.add(btEntrada);

        btOpcao = new JButton("Opção");
        btOpcao.setBounds(360, 10, 100, 30);
        this.add(btOpcao);

        lbResposta = new JLabel("Resposta:");
        lbResposta.setBounds(10, 15, 300, 100);
        this.add(lbResposta);

        btMensagem.addActionListener(this);
        btConfirmacao.addActionListener(this);
        btEntrada.addActionListener(this);
        btOpcao.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btMensagem){
            showMessageDialog(this, "Esta é uma mensagem de erro","Erro",ERROR_MESSAGE);
            showMessageDialog(this, "Esta é uma mensagem de aviso","Atenção",WARNING_MESSAGE);
            showMessageDialog(this, "Esta é uma mensagem de atenção","Aviso",INFORMATION_MESSAGE);
        }
        
        if(e.getSource() == btConfirmacao){
            int retorno = showConfirmDialog(this,"Sim ou Não?", "Confirme", YES_NO_OPTION);
            if(retorno == -1){
                lbResposta.setText("Resposta: O usuário não selecionou nenhuma opção");
            }else if(retorno == 0){
                lbResposta.setText("Resposta: O usuário selecionou SIM");
            }else if(retorno == 1){
                lbResposta.setText("Resposta: O usuário selecionou NÃO");
            }
                            
        }
        
        if(e.getSource() == btEntrada){
            String retorno = showInputDialog(this, "Qual é o seu nome?","Informe", QUESTION_MESSAGE);
            lbResposta.setText("Resultado: Meu nome é: " + retorno);
        }
        
        if(e.getSource() == btOpcao){
            showInputDialog(this, "O que você quer?","Opte",QUESTION_MESSAGE, null,new String[]{"Tudo", "Nada"},"Nada");
        }
           
    }

    public static void main(String[] args) {

        //com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel
        //com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel
        //com.sun.java.swing.plaf.motif.MotifClassicLookAndFeel
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            // erro
        }
        new DialogoPadrao().setVisible(true);
    }
}
