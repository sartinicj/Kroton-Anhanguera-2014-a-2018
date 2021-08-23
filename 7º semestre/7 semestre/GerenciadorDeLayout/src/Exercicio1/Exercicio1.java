
package Exercicio1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Exercicio1 extends JFrame implements ActionListener {
   Color verde = new Color(34, 139, 34);
   Color vermelho = new Color(139,0, 0);
   Color azul = new Color(0, 0, 139);
    private JLabel lblClaras;
    private JLabel lblEscuras;
    //Claras
    private JButton btnBranco;
    private JButton btnVermelho;
    private JButton btnVerde;
    private JButton btnAzul;
    //Escuras
    private JButton btnPreto;
    private JButton btnVermelhoEs;
    private JButton btnVerdeEs;
    private JButton btnAzulEs;

    private JPanel painelBotoes;
    private JPanel painelBotoes2;
    private JPanel cor;

    public Exercicio1() {
        this.setTitle("Exercício 1");
        this.setSize(450, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        lblClaras = new JLabel("Claras",SwingConstants.CENTER);
        lblEscuras = new JLabel("Escuras",SwingConstants.CENTER);
        

        btnBranco = new JButton("Branco");
        btnVermelho = new JButton("Vermelho");
        btnVerde = new JButton("Verde");
        btnAzul = new JButton("Azul");
        btnPreto = new JButton("Preto");
        btnVermelhoEs = new JButton("Vermelho");
        btnVerdeEs = new JButton("Verde");
        btnAzulEs = new JButton("Azul");

        painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(5, 1));
        painelBotoes.add(lblClaras);
        painelBotoes.add(btnBranco);
        btnBranco.addActionListener(this);
        painelBotoes.add(btnVermelho);
        btnVermelho.addActionListener(this);
        painelBotoes.add(btnVerde);
        btnVerde.addActionListener(this);
        painelBotoes.add(btnAzul);
        btnAzul.addActionListener(this);

        painelBotoes2 = new JPanel();
        painelBotoes2.setLayout(new GridLayout(5, 1));
        painelBotoes2.add(lblEscuras);
        painelBotoes2.add(btnPreto);
        btnPreto.addActionListener(this);
        painelBotoes2.add(btnVermelhoEs);
        btnVermelhoEs.addActionListener(this);
        painelBotoes2.add(btnVerdeEs);
        btnVerdeEs.addActionListener(this);
        painelBotoes2.add(btnAzulEs);
        btnAzulEs.addActionListener(this);

        this.add(painelBotoes, BorderLayout.WEST);
        this.add(painelBotoes2, BorderLayout.EAST);

        cor = new JPanel();

        this.add(cor);
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnBranco) {
            cor.setBackground(Color.white);
        }
        if (e.getSource() == btnVermelho) {
            cor.setBackground(Color.red);
        }
        if (e.getSource() == btnVerde) {
            cor.setBackground(Color.green);
        }
        if (e.getSource() == btnAzul) {
            cor.setBackground(Color.blue);
        }
        if (e.getSource() == btnPreto) {
            cor.setBackground(Color.black);
        }
        if (e.getSource() == btnVermelhoEs) {
            cor.setBackground(vermelho);
        }
        if (e.getSource() == btnVerdeEs) {
            cor.setBackground(verde);
        }
        if (e.getSource() == btnAzulEs) {
            cor.setBackground(azul);
        }
    }
}
