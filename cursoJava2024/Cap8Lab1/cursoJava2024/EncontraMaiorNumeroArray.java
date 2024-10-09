package cursoJava2024;

public class EncontraMaiorNumeroArray {

    public static void main(String[] args) {
        int[] array = {1, 57, 387, 9, 67};
        int maiorNumero = encontrarMaiorNumero(array);
        System.out.println("O maior número é: " + maiorNumero);
    }

    public static int encontrarMaiorNumero(int[] array) {
        int maior = array[0]; // Inicializa com o primeiro elemento
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i]; // Atualiza se encontrar um número maior
            }
        }
        return maior; // Retorna o maior número após percorrer todo o array
    }
}
