package gui;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario {

	JFrame janela = new JFrame();
	JPanel painel = new JPanel(null);

	JLabel lb1 = new JLabel("Nome");
	JTextField txt1 = new JTextField();

	JLabel lbl2 = new JLabel("Idade");
	JTextField txt2 = new JTextField();

	JButton bt1 = new JButton("Ok");

	public Formulario() {

		lb1.setBounds(10, 10, 200, 20);
		txt1.setBounds(10, 30, 500, 20);
		lbl2.setBounds(10, 60, 200, 20);
		txt2.setBounds(10, 80, 50, 20);

		bt1.setBounds(660, 120, 100, 25);
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				salvarEmArquivo();
				mensagem();
			}
		});

		painel.add(txt1);
		painel.add(lb1);
		painel.add(txt2);
		painel.add(lbl2);
		painel.add(bt1);

		// Criar uma janela.
		janela.add(painel);
		janela.setTitle("Meu formulario");
		janela.setSize(800, 600);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setResizable(false);
		janela.setVisible(true);
	}

	public void mensagem() {
		JOptionPane.showMessageDialog(null, "Dados salvos!");
	}
	
	public void salvarEmArquivo() {
		try {
			File file = new File("/home/everton.gago/Documents/dados.txt");
			if (!file.exists())
				file.createNewFile();
			FileOutputStream output = new FileOutputStream(file);
			output.write("meu nome e ".getBytes());
			output.write(txt1.getText().getBytes());
			output.write(" e tenho ".getBytes());
			output.write(txt2.getText().getBytes());
			output.write(" anos.".getBytes());
			
			output.flush();
			output.close();
		} catch (Exception e) {
			
		}
	}

}