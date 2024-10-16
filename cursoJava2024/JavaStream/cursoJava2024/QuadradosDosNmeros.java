package cursoJava2024;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuadradosDosNmeros {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer>quadrados = numeros.stream()
                            .map(n -> n * n)
                            .collect(Collectors.toList());
                            
        System.out.println("Quadrado de cada número: "+quadrados);
		
		
		
		
		
		
		
		
	}

}
