
package BorderLayoutExemplo;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
//FLOW LAYOUT
public class BorderLayoutExemplo extends JFrame {

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;

    public BorderLayoutExemplo() {
        this.setTitle("BorderLayout");
        this.setSize(500, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        btn1 = new JButton("1");
        this.add(btn1,BorderLayout.NORTH);
        btn2 = new JButton("2");
        this.add(btn2,BorderLayout.SOUTH);
        btn3 = new JButton("3");
        this.add(btn3,BorderLayout.EAST);
        btn4 = new JButton("4");
        this.add(btn4,BorderLayout.WEST);
        btn5 = new JButton("5");
        this.add(btn5,BorderLayout.CENTER);
    }
}
