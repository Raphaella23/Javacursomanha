package cursoJava2024;
import java.util.Arrays;
import java.util.List;

public class VerificaCondicoe {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(10,20,30,60,50,-5);
		
		boolean algumMaiorQue50 =  numeros.stream()
                            .anyMatch(n -> n > 50);
		System.out.println("Algm numero é maior que 50? "+ algumMaiorQue50);
		
		boolean todosPositivos = numeros.stream()
                           .allMatch(n -> n > 0);
		System.out.println("Todos os numero são positivos? " + todosPositivos);
		
		boolean todosNegativos = numeros.stream()
				           .allMatch(n -> n < 0);
		System.out.println("Todos os numeros são negativos? " +todosNegativos);
		
	
	}

}
