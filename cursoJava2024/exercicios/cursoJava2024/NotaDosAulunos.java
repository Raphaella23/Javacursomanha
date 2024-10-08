package cursoJava2024;

import java.util.Scanner;

public class NotaDosAulunos {

	public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   double nota1, nota2, nota3, nota4, mediaFinal;
   
   System.out.println("Digite a nota do 1 bimestre: ");
      nota1 = scanner.nextDouble();
      
      System.out.println("Digite a nota do 2 bimestre: ");
       nota2 = scanner.nextDouble();
       
       System.out.println("Digite a nota do 3 bismestre: ");
        nota3 = scanner.nextDouble();
        
        System.out.println("Digite a nota do 4 bismestre: ");
        nota4 = scanner.nextDouble();
        
        mediaFinal = (nota1 + nota2 + nota3 + nota4 )/ 4;
        
        System.out.println(mediaFinal);
        
         if (mediaFinal >= 7.0) {
        	 System.out.println("Prabens você foi PROVADO. ");
         }else {
        	 System.out.println("Você foi REPROVADO");
         }
         scanner.close();
	}

}
