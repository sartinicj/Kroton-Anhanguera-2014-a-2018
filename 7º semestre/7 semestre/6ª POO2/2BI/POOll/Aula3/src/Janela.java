
import static com.sun.deploy.uitoolkit.impl.fx.ui.MixedCodeInSwing.show;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aula
 */
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
public class Janela extends JFrame implements ActionListener{
    private JButton btnMensagem;
    private JButton btnConfirmacao;
    private JButton btnEntrada;
    private JButton btnOpcao;
    
    private JLabel lblResultado;
    private JLabel lblResultadotxt;
    
    public Janela(){
        this.setTitle("Dialogos padronizados");
        this.setSize(500, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        this.setResizable(false);
        centralizar();
        
        btnMensagem = new JButton("Mensagem");
        btnMensagem.setBounds(10, 20, 100, 20);
        this.add(btnMensagem);
        btnMensagem.addActionListener(this);
        
        btnConfirmacao = new JButton("Confirmação");
        btnConfirmacao.setBounds(120, 20, 110, 20);
        this.add(btnConfirmacao);
        btnConfirmacao.addActionListener(this);
        
        btnEntrada = new JButton("Entrada");
        btnEntrada.setBounds(240, 20, 100, 20);
        this.add(btnEntrada);
        btnEntrada.addActionListener(this);
         
        btnOpcao = new JButton("Opção");
        btnOpcao.setBounds(350, 20, 100, 20);
        this.add(btnOpcao);
        btnOpcao.addActionListener(this);
        
        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(10, 70, 100, 20);
        this.add(lblResultado);
        
        lblResultadotxt = new JLabel("Não informou nenhum valor");
        lblResultadotxt.setBounds(75, 70, 200, 20);
        this.add(lblResultadotxt);
    }
    
    private void centralizar() {
        Dimension dt = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dj = getSize();
        this.setLocation((dt.width - dj.width) / 2, (dt.height - dj.height) / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMensagem) {
            JOptionPane.showMessageDialog(this,"Mensagem de ERRO","Erro",ERROR_MESSAGE);
            JOptionPane.showMessageDialog(this,"Mensagem de AVISO","AVISO",INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this,"Mensagem de ATENÇÃO","ATENÇÃO",WARNING_MESSAGE);
        }
        if (e.getSource() == btnConfirmacao) {
            int retorno= JOptionPane.showConfirmDialog(this,"Sim ou Não?","Confirme",YES_NO_OPTION);//-1 X 0 SIM 1 NAO
            if(retorno == -1){
            lblResultadotxt.setText("O usuário não selecionou nenhuma opção");
            }else if(retorno == 0){
            lblResultadotxt.setText("O usuário selecionou sim");
            }else if(retorno == 1){
                lblResultadotxt.setText("O usuário selecionou nao");
            
            }
            JOptionPane.showConfirmDialog(this,"OK?","Confirme",OK_CANCEL_OPTION);
        }
        if (e.getSource() == btnEntrada) {
            String retorno = JOptionPane.showInputDialog(this,"Qual é o seu nome?","Informe",QUESTION_MESSAGE);
            lblResultadotxt.setText(retorno);
        }
         if (e.getSource() == btnOpcao) {
             JOptionPane.showInputDialog(this,"O que voce quer","Opte",QUESTION_MESSAGE,null,new String[]{"Tudo","Nada","Dains"}, "Nada");
        }

    }

}
