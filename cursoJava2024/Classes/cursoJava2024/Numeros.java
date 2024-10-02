package cursoJava2024;

	 import java.util.Scanner;	

		 
		 class VerificadorPrimo {
		  public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
				System.out.print("Digite um numero inteiro: ");
				  int numero = scanner.nextInt();
				  
				  if (numero <= 1) {
					  System.out.println(numero + " não é primo.");
					  return;
					  
				  }
				  
					  int divisores = 0;
					  for (int i = 1; i <= numero; i++) {
						  if (numero % i == 0) {
							  divisores++;
						  }
					  }
							  
						if (divisores == 2) {
							System.out.println(numero + " é primo.");
						} else {
							System.out.println(numero + " não é primo.");
						}
						scanner.close();
		  }
		 }
		 