package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class CalculadoraIMCIAC extends JFrame {
    private JTextField txtPeso, txtAltura, txtQuadril;
    private JLabel lblResultadoIMC, lblResultadoIAC;

    public CalculadoraIMCIAC() {
        // Configura a janela principal
        setTitle("Calculadora de IMC e IAC");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Layout da janela
        setLayout(new GridLayout(7, 2));

        // Componentes da interface gráfica
        JLabel lblPeso = new JLabel("Peso (kg):");
        txtPeso = new JTextField();
        JLabel lblAltura = new JLabel("Altura (m):");
        txtAltura = new JTextField();
        JLabel lblQuadril = new JLabel("Circunferência do Quadril (cm):");
        txtQuadril = new JTextField();

        JButton btnCalcular = new JButton("Calcular");
        lblResultadoIMC = new JLabel("IMC: ");
        lblResultadoIAC = new JLabel("IAC: ");

        // Adiciona os componentes à janela
        add(lblPeso);
        add(txtPeso);
        add(lblAltura);
        add(txtAltura);
        add(lblQuadril);
        add(txtQuadril);
        add(btnCalcular);
        add(new JLabel()); // Espaçamento
        add(lblResultadoIMC);
        add(new JLabel()); // Espaçamento
        add(lblResultadoIAC);
        add(new JLabel()); // Espaçamento

        // Evento para o botão "Calcular"
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMCIAC();
            }
        });

        // Tornar a janela visível
        setVisible(true);
    }

    // Método para calcular o IMC e o IAC
    private void calcularIMCIAC() {
        try {
            // Obter os valores de peso, altura e quadril
            double peso = Double.parseDouble(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            double quadril = Double.parseDouble(txtQuadril.getText());

            // Calcular IMC
            double imc = peso / (altura * altura);

            // Calcular IAC
            double iac = (quadril / (altura * Math.sqrt(altura))) - 18;

            // Exibir os resultados
            lblResultadoIMC.setText(String.format("IMC: %.2f", imc));
            lblResultadoIAC.setText(String.format("IAC: %.2f", iac));

            // Gerar arquivo com os resultados
            gerarArquivo(imc, iac);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
        }
    }

    // Método para gerar um arquivo com os resultados
    private void gerarArquivo(double imc, double iac) {
        try {
            FileWriter writer = new FileWriter("resultadosIMCIAC.txt");
            writer.write(String.format("Resultados do cálculo:\nIMC: %.2f\nIAC: %.2f\n", imc, iac));
            writer.close();
            JOptionPane.showMessageDialog(null, "Arquivo 'resultadosIMCIAC.txt' gerado com sucesso!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar o arquivo.");
        }
    }

    public static void main(String[] args) {
        // Executar a aplicação
        new CalculadoraIMCIAC();
    }
}
