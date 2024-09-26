	
import java.util.Scanner;

public class CalcularValorT {
	public static void main(String[] args) {
		//Constantes
	final double TAXA_FIXA = 10.0;
	final double PRECO_POR_KM = 2.0;
	
	//cria um scanner
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Digite a quantidade de quilometros KmRodados:");
	double KmRodado = scanner.nextDouble();
	
	//Solicita a quantidade de quilometros rodados
	
	double valorTotal = TAXA_FIXA + (PRECO_POR_KM * KmRodado);
	
	//Exibe o valor total
	System.out.printf("O valor a ser pago é: R$ %.2f%n", valorTotal);
	
	//Fecha scanner 
	scanner.close();
	
	

	}

}
