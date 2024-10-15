package cursoJava2024;

import javax.swing.*;
import java.awt.event.*; // Importação correta do ActionListener e ActionEvent

public class OlaMundoGUI extends JFrame {
    public OlaMundoGUI() {
        // Configuração da tela/janela:
        setTitle("Olá Mundo em JAVA");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela
        
        // Criar um botão:
        JButton botao = new JButton("Clique em mim!");
        
        // Adicionar um evento escutador:
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibir um popup com a mensagem "Olá Mundo"
                JOptionPane.showMessageDialog(null, "Olá Raphaella");
            }
        });
        
        // Adicionar o botão à janela:
        add(botao);
        
        // Tornar a janela visível:
        setVisible(true);
    }

    public static void main(String[] args) {
        // Chamar e executar a GUI:
        new OlaMundoGUI();
    }
}
