
import java.awt.Color;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fpj.8483182138
 */
public class JanelaAmarela extends JFrame {
    private Color minhacor = new Color(255,255,200); 
    public JanelaAmarela(){
        this.getContentPane().setBackground(minhacor); //Muda a cor de fundo (padrões, ou escolhidas) 
        this.getContentPane().setLayout(null);// Desabilita o gerenciador de layout. Permitindo o tamanho e a posiçãqo de cada Componente 
        //this.setResizable(false);//Impede que a janela seja redimensionada
    }
    
    public static void main(String[] args) {
        new JanelaAmarela().setVisible(true);
    }
    
}
