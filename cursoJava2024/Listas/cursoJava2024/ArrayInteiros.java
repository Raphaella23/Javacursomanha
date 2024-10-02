package cursoJava2024;
public class ArrayInteiros {

	public static void main(String[] args) {

		int[] numero = {20,40,50,90};
		//exibindo valores:
		System.out.println("Valores do numero inteiro: ");
		System.out.println("numero selecionado: " + numero[ 1 ]);
		System.out.println("-----------------------");
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Elemento"+ i + ":" + numero[i]);
		}
	}

}
