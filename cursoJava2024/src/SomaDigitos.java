import java.util.Scanner;

public class SomaDigitos {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero = scanner.nextInt();
		
		int soma = (numero /9);
		
		System.out.println("A soma do digito é " +numero+ " é: "+soma );
		scanner.close();
	}
		
public static int CalculaSomaDigito (int numero) {		
      int soma = 0;
      
      while(numero !=0 )	{
    	  soma += numero % 10;
    	  
    	  numero /= 10;
      }
return soma;
	
	}
}

