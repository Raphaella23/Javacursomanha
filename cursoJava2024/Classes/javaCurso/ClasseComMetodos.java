package javaCurso;

import java.util.Scanner;

public class ClasseComMetodos {
	
	
	public static boolean Primo(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i =2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero e veja se ela e número primo: ");
		int numero = sc.nextInt();
		
		
		
		if(Primo(numero)) {
			System.out.println("Este numnero e primo "+numero);
		}else {
			System.out.println("Este numero não e primo "+numero);
		}
		

	}

}