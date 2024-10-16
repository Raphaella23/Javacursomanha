package cursoJava2024;
public class SistemaEmpresa {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("matheus");

        Gerente gerente = new Gerente("miriam");

        System.out.println("O funcionário " + funcionario.getNome() + " não é um gerente.");
        System.out.println(gerente.verificarCargo());
    }
}