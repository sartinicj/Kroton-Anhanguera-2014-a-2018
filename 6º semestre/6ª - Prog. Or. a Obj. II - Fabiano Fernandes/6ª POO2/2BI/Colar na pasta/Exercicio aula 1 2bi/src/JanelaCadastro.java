
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fpj.8483182138
 */
public class JanelaCadastro extends JanelaAmarela {

    public JanelaCadastro() {
        this.setTitle("Janela Cadastro");
        JPanel pEsq = new JPanel();//Cria o painel da esquerda
        JPanel pDir = new JPanel();//Cria o painel da direita
        JPanel pRod = new JPanel();//cria o painel do rodapé
        JButton btnGravar = new JButton();//Cria o botão Gravar
        JButton btnSair = new JButton();//Cria o botão Sair
        btnGravar.setText("Gravar");//Renomea o botão
        btnSair.setText("Sair");//Renomea o botão
        this.add(pEsq);
        this.add(pDir);
        this.add(pRod);
        pRod.add(btnGravar);
        pRod.add(btnSair);
        
        pEsq.setBounds(10, 10, 200, 470);//Os dois primeiros (x,y) é quantos pixels da borda vai ser posicionado. Os dois últimos a dimensão
        pEsq.setBackground(Color.MAGENTA);
        pDir.setBounds(220, 10, 550, 470);//(200(primeiro painel)+ 20, 10, [tamanho da janela])
        pDir.setBackground(Color.MAGENTA);
        pRod.setBounds(10, 490, 750, 600);//(10, soma do pixl+altura, [tamanho da janela])
        pRod.setBackground(Color.MAGENTA);
        btnGravar.setBounds(290,100,40,53);
        btnSair.setBounds(400,100,40,53);
    }
    public static void main(String[] args) {
        new JanelaCadastro().setVisible(true);
    }
}
