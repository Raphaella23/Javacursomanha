package cursoJava2024;

import java.util.Scanner;

public class CalculadoraIRPF {

    public static double calcularIRPF(double salarioBruto, int numDependentes) {
        // Dedução por dependente
        double deducaoDependentes = numDependentes * 189.59;
        // Base de cálculo após deduções
        double baseCalculo = salarioBruto - deducaoDependentes;

        // Variável para armazenar o valor do imposto
        double imposto = 0.0;

        // Faixas de imposto de renda
        if (baseCalculo <= 2112.00) {
            imposto = 0.0;
        } else if (baseCalculo <= 2826.65) {
            imposto = (baseCalculo - 2112.00) * 0.075;
        } else if (baseCalculo <= 3751.05) {
            imposto = (2826.65 - 2112.00) * 0.075 + (baseCalculo - 2826.65) * 0.15;
        } else if (baseCalculo <= 4664.68) {
            imposto = (2826.65 - 2112.00) * 0.075 + (3751.05 - 2826.65) * 0.15 + (baseCalculo - 3751.05) * 0.225;
        } else {
            imposto = (2826.65 - 2112.00) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (baseCalculo - 4664.68) * 0.275;
        }

        return imposto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do salário bruto
        System.out.print("Digite o salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();

        // Entrada do número de dependentes
        System.out.print("Digite o número de dependentes: ");
        int numDependentes = scanner.nextInt();

        // Cálculo do imposto de renda
        double imposto = calcularIRPF(salarioBruto, numDependentes);

        // Exibe o resultado
        System.out.printf("O imposto de renda devido é: R$ %.2f%n", imposto);

        scanner.close();
    }
}
