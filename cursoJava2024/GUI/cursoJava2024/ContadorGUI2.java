package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContadorDeCliques extends JFrame {
	private int contador = 0;
	private JButton botao;
	private JLabel rotulo;
	
	public ContadorDeCliques() {
		//Configurar a janela
		setTitle("Contador de Cliques");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Criar os componentes
		botao = new JButton("Clique aqui!");
		rotulo = new JLabel("Numero de cliques: 0");
		
		//Adicionar um ouvinte de ação ao botão
		botao.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				contador++;
				rotulo.setText("Numero de cliques: " + contador);
			}
			});
		
		//Adicionar os componentes a janela
		add(botao, BorderLayout.CENTER);
		add(rotulo, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContadorDeCliques();
			}
					
		}