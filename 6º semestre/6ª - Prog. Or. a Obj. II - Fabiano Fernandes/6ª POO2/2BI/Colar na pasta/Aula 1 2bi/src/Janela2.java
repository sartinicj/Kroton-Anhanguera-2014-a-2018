
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fpj.8483182138
 */
public class Janela2 {

    public Janela2() { //Construtor vazio
        JFrame j = new JFrame(); //Cria a janela
        j.setSize(800, 600); //Determina o tamanho da Janela
        j.setTitle("Segunda janela"); //Define o nome da janela
        j.setVisible(true); //Torna-a visivel
        j.setDefaultCloseOperation(EXIT_ON_CLOSE); //Define o comportamento da janela  
    }
    public static void main(String[] args) { //Criação do main
        new Janela2(); //Chama o construtor
    }
}
