package cursoJava2024;

public final class ClassesComMetodos {
	// Metodo 01:calcula a soma de dois numeros:
	public int soma(int a, int b) {
		return a + b;
	}

	// Metodo 02: Verifica se o numero é par:
	public boolean ehPar(int numero) {
		return numero % 2 == 0;

	}

	// Metodo 03: inverte string:
	public String inverteString(String texto) {
			return new StringBuilder(texto).reverse().toString();
		}

	//Metodo 04:calcula o fatorial de um numero:
	public int fatorial(int numero) {
		if (numero == 0 || numero == 1 ) {
			return 1;
			
		}
		return numero * fatorial(numero - 1 );
	}
	
	public static void main(String[] args) {
		// Instaciando a classe:
		ClassesComMetodos utilidades = new ClassesComMetodos();
		// Chamando os metodos:
		// System.out.println("A soma de de 900 e 233 é: "+ utilidades.soma(900, 233));
		// System.out.println("O numero 6 é par?: "+ utilidades.ehPar(20) );
		//System.out.println("String invertida de 'raphaella' é : " + utilidades.inverteString("raphaella"));
		System.out.println("Ftorial de 5 é :"+ utilidades.fatorial(5));
	}

}

//
