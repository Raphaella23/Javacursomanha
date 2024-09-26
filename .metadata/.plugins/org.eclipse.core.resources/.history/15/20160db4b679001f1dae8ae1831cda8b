import java.util.Scanner;

public class TaxiCalculator {

    public static void main(String[] args) {
        // Constantes
        final double TAXA_FIXA = 10.0;
        final double PRECO_POR_KM = 2.0;

        // Cria um scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de quilômetros rodados
        System.out.print("Digite a quantidade de quilômetros rodados: ");
        double kmRodados = scanner.nextDouble();

        // Calcula o valor total a ser pago
        double valorTotal = TAXA_FIXA + (PRECO_POR_KM * kmRodados);

        // Exibe o valor total
        System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotal);

        // Fecha o scanner
        scanner.close();
    }
}
