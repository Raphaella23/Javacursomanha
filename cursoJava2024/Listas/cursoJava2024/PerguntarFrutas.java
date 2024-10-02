package cursoJava2024;

// Importando classes do Java
import java.util.Scanner; // Para interagir com o usuário
import java.util.ArrayList; // Para criar uma lista dinâmica

public class PerguntarFrutas {

    public static void main(String[] args) {
        // Criando um ArrayList para armazenar as frutas
        ArrayList<String> frutas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String fruta;

        System.out.println("Digite os nomes das frutas (ou digite 'sair' para encerrar):");

        // Loop para adicionar frutas ao ArrayList até o usuário digitar "sair":
        while (true) {
            System.out.print("Digite o nome da fruta: "); // Usando print para ficar na mesma linha
            fruta = sc.nextLine();

            if (fruta.equalsIgnoreCase("sair")) {
                break;
            }

            frutas.add(fruta); // Adiciona a fruta ao ArrayList
        }

        // Exibir todas as frutas inseridas
        System.out.println("\nFrutas inseridas: ");
        for (String f : frutas) {
            System.out.println(f);
        }

        // Fechando o Scanner
        sc.close();
    }
}