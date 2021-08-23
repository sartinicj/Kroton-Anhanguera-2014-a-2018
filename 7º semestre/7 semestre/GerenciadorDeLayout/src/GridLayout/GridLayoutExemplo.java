/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GridLayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
//FLOW LAYOUT
public class GridLayoutExemplo extends JFrame {

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;

    public GridLayoutExemplo() {
        this.setTitle("GridLayout");
        this.setSize(500, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,2));
        
        btn1 = new JButton("1");
        this.add(btn1);
        btn2 = new JButton("2");
        this.add(btn2);
        btn3 = new JButton("3");
        this.add(btn3);
        btn4 = new JButton("4");
        this.add(btn4);
    }
}
