
package Exercício;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//FLOW LAYOUT
public class Exercicio extends JFrame {

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;

    private JPanel painelBotoes;
    public Exercicio() {
        this.setTitle("Janelas Complexas");
        this.setSize(450, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        btn1 = new JButton("Gravar");
        btn2 = new JButton("Atualizar");
        btn3 = new JButton("Cancelar");

        painelBotoes= new JPanel();
        painelBotoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painelBotoes.setBackground(Color.red);
                
        painelBotoes.add(btn1);
        painelBotoes.add(btn2);
        painelBotoes.add(btn3);
        
        this.add(painelBotoes,BorderLayout.SOUTH);

    }
}