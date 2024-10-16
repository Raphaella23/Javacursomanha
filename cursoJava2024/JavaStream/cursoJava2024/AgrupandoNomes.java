package cursoJava2024;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupandoNomes {
    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Maria", "João", "Pedro", "Carlos");

        // Agrupando os nomes por tamanho
        Map<Integer, List<String>> nomesPorTamanho = nomes.stream()
                                                        .collect(Collectors.groupingBy(String::length));

        // Imprimindo os resultados
        nomesPorTamanho.forEach((tamanho, grupo) -> {
            System.out.println("Nomes com " + tamanho + " letras:");
            grupo.forEach(System.out::println);
        });
    }
}