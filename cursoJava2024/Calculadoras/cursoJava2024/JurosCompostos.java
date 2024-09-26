package cursoJava2024;
import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {
		//Instanciando uma classe para usa-la:
		Scanner sc = new Scanner(System.in);
		
		//Entradas do usuario:
		//Pegando o capital inicial:
		System.out.println("Digite o capital: ");
		double capital = sc.nextDouble();
		
		//pegando a taxa de juro:
		System.out.println("Qual é a taxa de juros: ");
		 double taxa = sc.nextDouble();
		 
		 //Pegando o tempo:
		 System.out.println("Digite o tempo: ");
		 int tempo = sc.nextInt();
		 
		 //Calculando os juros compostos:
		 double montante = capital * Math.pow(taxa/100, tempo);
		 //Saida final
		 System.out.println("O montante final sera de R$"+ montante);
		 sc.close();
		

	}

}
