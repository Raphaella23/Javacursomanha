package cursoJava2024;
import java.util.Scanner;
public class CalculoDoIMC {

	public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.println(imc);
        
        if (imc < 18.5) {
        	System.out.println("Classificação: Abaixo do peso. ");
        }else if( imc >= 18.5 && imc < 24.9) {
        	System.out.println("Classificação: Peso normal. ");
        }else if ( imc >= 25 && imc < 30) {
        	System.out.println("Sobre peso. ");
        }else {
        	System.out.println("Obesidade. ");
        }
        scanner.close();
        
        
	}

	}

