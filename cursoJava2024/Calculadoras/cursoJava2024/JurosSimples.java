package cursoJava2024;
import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		//Intanciando a class (usando a class) 
		Scanner scanner = new Scanner(System.in);
		
		//entrada de valores:
		System.out.println("--------------------");
		System.out.println(" calculadora de juros simples" ); 
		System.out.println("---------------------");
		System.out.println("Digite o capital: ");
		double capital = scanner.nextDouble();
		
		System.out.println("Infome a taxa de juros: (%) ");
		double taxa = scanner.nextDouble();
		
		System.out.println("Informe o tempo: (anos) ");
		int tempo = scanner.nextInt();
		
		//calculando os juros:
		double juros = (capital * taxa * tempo)/100;
		System.out.println("O valor do juro são:"+juros);
	
		//resultado:
		double total = capital + juros;
		System.out.println("O total investido + juro é de:"+ total);
		
		scanner.close();
		

	}

}
