
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.time.Clock.system;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Cadastro extends JFrame implements ActionListener {

    private JLabel lblAgencia;
    private JLabel lblConta;
    private JLabel lblBanco;
    private JLabel lblNome;
    private JLabel lblEndereco;
    private JLabel lblTelefone;
    private JLabel lblCPF;

    private JTextField txtAgencia;
    private JTextField txtConta;
    private JTextField txtNome;
    private JTextField txtEndereco;
    private JTextField txtTelefone;
    private JTextField txtCPF;

    private JComboBox jcBanco;

    private JSeparator separador1;
    private JSeparator separador2;

    private JRadioButton btnCC;
    private JRadioButton btnCP;

    private JButton btnGravar;
    private JButton btnAtualizar;
    private JButton btnSair;

    public Cadastro() {
        this.setTitle("Talitha");
        this.setSize(400, 255);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        centralizar();

        lblAgencia = new JLabel("Agência");
        lblAgencia.setBounds(10, 10, 110, 18);
        this.add(lblAgencia);

        txtAgencia = new JTextField();
        txtAgencia.setBounds(65, 10, 50, 20);
        this.add(txtAgencia);

        lblConta = new JLabel("Conta");
        lblConta.setBounds(125, 10, 105, 18);
        this.add(lblConta);

        txtConta = new JTextField();
        txtConta.setBounds(160, 10, 50, 20);
        this.add(txtConta);

        lblBanco = new JLabel("Banco");
        lblBanco.setBounds(240, 10, 85, 20);
        this.add(lblBanco);

        jcBanco = new JComboBox(new String[]{"Itaú", "Bradesco"});
        jcBanco.setBounds(285, 10, 85, 20);
        this.add(jcBanco);

        separador1 = new JSeparator();
        separador1.setBounds(10, 40, 365, 10);
        this.add(separador1);

        lblNome = new JLabel("Nome :");
        lblNome.setBounds(30, 55, 300, 10);
        //lblNome.setHorizontalAlignment(SwingConstants.RIGHT);//Alinhar a Direita
        this.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(75, 50, 300, 20);
        this.add(txtNome);

        lblEndereco = new JLabel("Endereço :");
        lblEndereco.setBounds(10, 80, 300, 10);
        this.add(lblEndereco);

        txtEndereco = new JTextField();
        txtEndereco.setBounds(75, 75, 300, 20);
        this.add(txtEndereco);

        lblTelefone = new JLabel("Telefone :");
        lblTelefone.setBounds(15, 105, 300, 10);
        this.add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setBounds(75, 100, 300, 20);
        this.add(txtTelefone);

        lblCPF = new JLabel("CPF :");
        lblCPF.setBounds(42, 130, 300, 10);
        this.add(lblCPF);

        txtCPF = new JTextField();
        txtCPF.setBounds(75, 125, 300, 20);
        this.add(txtCPF);

        btnCC = new JRadioButton("Conta Corrente");
        btnCC.setBounds(95, 150, 115, 20);
        this.add(btnCC);

        btnCP = new JRadioButton("Conta Poupança");
        btnCP.setBounds(210, 150, 120, 20);
        this.add(btnCP);

        separador2 = new JSeparator();
        separador2.setBounds(10, 175, 365, 10);
        this.add(separador2);

        btnGravar = new JButton("Gravar");
        btnGravar.setBounds(40, 185, 100, 20);
        this.add(btnGravar);
        btnGravar.addActionListener(this);

        btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds(145, 185, 100, 20);
        this.add(btnAtualizar);
        btnAtualizar.addActionListener(this);

        btnSair = new JButton("Sair");
        btnSair.setBounds(250, 185, 100, 20);
        this.add(btnSair);
        btnSair.addActionListener(this);

    }

    private void centralizar() {
        Dimension dt = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dj = getSize();
        this.setLocation((dt.width - dj.width) / 2, (dt.height - dj.height) / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGravar) {
            //System.out.println("Gravado com sucesso");
            DBFactory.salvar(txtNome.getText(), txtEndereco.getText(), txtTelefone.getText(), txtCPF.getText());
            txtNome.setText("");
            txtEndereco.setText("");
            txtTelefone.setText("");
            txtCPF.setText("");
        }

        if (e.getSource() == btnAtualizar) {
           // System.out.println("Atualizado com sucesso");
           DBFactory.atualizar(txtNome.getText(), txtEndereco.getText(), txtTelefone.getText(), txtCPF.getText());
            txtNome.setText("");//pra limpar os textsFields
            txtEndereco.setText("");
            txtTelefone.setText("");
            txtCPF.setText("");
        }

        if (e.getSource() == btnSair) {
            System.out.println("Saindo do Programa");
            System.exit(0);
        }

    }

}
