package cursoJava2024;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemovendoDuplicatas2 {

	public static void main(String[] args) {

		List<String> nomes = Arrays.asList("Ana","Erick","Julia","Lais","Henry","MIKAELY");
		
		Map<Integer, List<String>> nomesAgrupadosPorTamanho = nomes.stream()
         .collect(Collectors.groupingBy(String::length));
		
		nomesAgrupadosPorTamanho.forEach((tamanho, listaNomes) ->
		System.out.println("Tamanho " + tamanho + ":" +listaNomes)
		
		);
		
	}

}
