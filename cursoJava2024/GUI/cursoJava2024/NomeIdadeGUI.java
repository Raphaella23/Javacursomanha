package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NomeIdadeGUI extends JFrame {
private JTextField txtNome, txtIdade;

public NomeIdadeGUI() {
	
	setTitle("Inserir Nome e Idade");
	setSize(300, 170);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	
	setLayout(new GridLayout(3, 2));
	
	JLabel IbINome = new JLabel("Nome:");
	txtNome = new JTextField();
	JLabel IbIIdade = new JLabel("Idade:");
	txtIdade = new JTextField();
	
	JButton btnExibir = new JButton("exibir");
	
	btnExibir.addActionListener(new ActionListener() {
		@Override
		
		public void actionPerformed(ActionEvent e) {
			String nome = txtNome.getText();
			String idade = txtIdade.getText();
			
			JOptionPane.showMessageDialog(null, "Nome :" + nome + "nIdade:" + idade);
		}
		
	});
	add(IbINome);
	add(txtNome);
	add(IbIIdade);
	add(txtIdade);
	add(new JLabel());
	add(btnExibir);
	
	setVisible(true);
}
	public static void main(String[] args) {
		new NomeIdadeGUI();
	}
}



