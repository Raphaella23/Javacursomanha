package cursoJava2024;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MudarCorDeFundoGUI extends JFrame{
	private JPanel panel;
	
	public MudarCorDeFundoGUI() {
		
		setTitle("Muda Cor De Fundo");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		
		JPanel panelBotoes = new JPanel();
		panelBotoes.setLayout(new FlowLayout());
		
		JButton btnVermelho = new JButton("Vermelho");
		btnVermelho.setBackground(Color.RED);
		btnVermelho.setOpaque(true);
		btnVermelho.setBorderPainted(false);
		
		JButton btnAzul = new JButton("Azul");
		btnAzul.setBackground(Color.blue);
		btnAzul.setOpaque(true);
		btnAzul.setBorderPainted(false);
		
		JButton btnVerde = new JButton("Verde");
		btnVerde.setBackground(Color.green);
		btnVerde.setOpaque(true);
		btnVerde.setBorderPainted(false);
		
		panelBotoes.add(btnVermelho);
		panelBotoes.add(btnAzul);
		panelBotoes.add(btnVerde);
		add(panelBotoes, BorderLayout.SOUTH);
		
		btnVermelho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.RED);
				
			}
		});
		
		btnAzul.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.BLUE);
		}
		});
		btnVerde.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.GREEN);
			}
		});
		
		panel.add(btnAzul);
		panel.add(btnAzul);
		panel.add(btnAzul);
		
		add(panel);
		
		setVisible(true);
	}
		public static void main(String[] args) {
			new  MudarCorDeFundoGUI();
			
		}
}		
		
		
		
		
		
		
	
	
	


