package cursoJava2024;
public class SistemaEmpresa {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Carlos");

        Gerente gerente = new Gerente("Ana");

        System.out.println("O funcionário " + funcionario.getNome() + " não é um gerente.");
        System.out.println(gerente.verificarCargo());
    }
}