
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fpj.8483182138
 */
public class Cadastro extends JFrame { //Classe Cadastro está herdando Classe JFrame
    //Definição de atributos:

    private JLabel lbAgencia;
    private JLabel lbConta;
    private JLabel lbBancos;
    private JLabel lbNome;
    private JLabel lbEnd;
    private JLabel lbTel;
    private JLabel lbCPF;
    private JLabel lbcc;
    private JLabel lbcp;
    private JTextField txtAgencia;
    private JTextField txtConta;
    private JTextField txtNome;
    private JTextField txtEnd;
    private JTextField txtTel;
    private JTextField txtCPF;
    private JComboBox jcBancos;
    private JSeparator separador1;
    private JRadioButton btcc;
    private JRadioButton btcp;
    
    
        
    public Cadastro() { //Construtor vazio (sem nenhum argumento)
        this.setSize(400, 255); //Tamanho da janela
        this.setTitle("Janela Cadastro"); //Titulo da janela
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Operação padrão de fechamento da janela
        this.getContentPane().setLayout(null);
        centralizar(); 
        
        lbAgencia = new JLabel("Agência");
        lbAgencia.setBounds(10, 10, 110, 18);
        this.add(lbAgencia);
        
        lbConta = new JLabel("Conta");
        lbConta.setBounds(125, 10, 105, 18);
        this.add(lbConta);
        
        lbBancos = new JLabel("Bancos");
        lbBancos.setBounds(225, 10, 100, 18);
        this.add(lbBancos);
        
        lbNome = new JLabel("Nome:");
        lbNome.setBounds(10,60,100,10);
        this.add(lbNome);
        
        lbEnd = new JLabel("Endereco:");
        lbEnd.setBounds(10,80,100,10);
        this.add(lbEnd);
        
        lbTel = new JLabel("Telefone:");
        lbTel.setBounds(10,100,100,10);
        this.add(lbTel);
        
        lbCPF = new JLabel("CPF:");
        lbCPF.setBounds(10,120,100,10);
        this.add(lbCPF);
        
        lbcc = new JLabel("Conta Corrente");
        lbcc.setBounds(100, 160, 100, 18);
        this.add(lbcc);
        
        lbcp = new JLabel("Conta Poupança");
        lbcp.setBounds(250, 160, 330, 18);
        this.add(lbcp);
                
        txtAgencia = new JTextField();
        txtAgencia.setBounds(65,10,50,20);
        this.add(txtAgencia);
        
        txtConta = new JTextField();
        txtConta.setBounds(160,10,50,20);
        this.add(txtConta);
        
        jcBancos = new JComboBox (new   String [] {"Itaú", "Bradesco"});
        jcBancos.setBounds(285,10,85,20);
        this.add(jcBancos);
        
        separador1 = new JSeparator();
        separador1.setBounds(10,40,365,10);
        this.add(separador1); 
        
        txtNome = new JTextField();
        txtNome.setBounds(65,60,310,20);
        this.add(txtNome); 
        
        txtEnd = new JTextField();
        txtEnd.setBounds(69,80,305,20);
        this.add(txtEnd);
        
        txtTel = new JTextField();
        txtTel.setBounds(65,100,305,20);
        this.add(txtTel);
        
        txtCPF = new JTextField();
        txtCPF.setBounds(65,120,305,20);
        this.add(txtCPF);
        
        btcc = new JRadioButton();
        btcc.setBounds(80,165,20,10); 
        this.add(btcc); 

        btcp = new JRadioButton();
        btcp.setBounds(280,165,20,10); 
        this.add(btcp);        
    }
    
    private void centralizar() {
        Dimension dj = this.getSize(); //Dimensão da janela
        Dimension dt = Toolkit.getDefaultToolkit().getScreenSize(); //Dimensão da tela
        this.setLocation((dt.width - dj.width) / 2, (dt.height - dj.height) / 2); //Acha o meio     
    }

    public static void main(String[] args) {
        new Cadastro().setVisible(true);
    }
    
}


    

