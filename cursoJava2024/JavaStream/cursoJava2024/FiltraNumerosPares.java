package cursoJava2024;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiltraNumerosPares {
	public static void main(String[] args) {
List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

List<Integer> numerosPares = new ArrayList<>();

for(Integer numero : numeros) {
	if (numero % 2 == 0) {
		numerosPares.add(numero);
		
	}
}
		System.out.println("Números Pares:"+ numerosPares);
		
		
		
		
	}

}
