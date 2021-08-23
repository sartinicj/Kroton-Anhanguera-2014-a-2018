
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
//FLOW LAYOUT
public class FlowLayoutExemplo extends JFrame {

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;

    public FlowLayoutExemplo() {
        this.setTitle("FlowLayout");
        this.setSize(500, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        
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
