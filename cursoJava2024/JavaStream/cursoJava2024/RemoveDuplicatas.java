package cursoJava2024;

// exercicio para remover duplicatas(distint)
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatas {

	public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1,25,25,90,90,9,40);
		
    //removendo duplicatas
    numeros.stream().distinct().forEach(System.out::println);
		
		
		
		
		
	}

}
