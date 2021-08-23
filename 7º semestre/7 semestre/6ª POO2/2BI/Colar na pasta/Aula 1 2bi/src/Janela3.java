
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.Boolean.TRUE;
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
public class Janela3 extends JFrame {

    public Janela3() {
        this.setSize(800, 600);
        this.setTitle("Terceira Janela");
        this.setVisible(TRUE);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.centralizar(); //Centraliza a janela
}
      private void centralizar() {
       Dimension dj = this.getSize(); //Dimensão da janela
       Dimension dt = Toolkit.getDefaultToolkit().getScreenSize(); //Dimensão da tela
       this.setLocation((dt.width-dj.width)/2,(dt.height-dj.height)/2); //Acha o meio     
    }
public static void main(String[] args) {
        new Janela3();
    }

}
