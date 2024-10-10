package cursoJava2024;
public class Gerente extends Funcionario {
	
     public  Gerente(String nome) {
        super(nome);
    }

    public String verificarCargo() {
        return "O funcionário " + getNome() + " é um gerente.";
    }
}