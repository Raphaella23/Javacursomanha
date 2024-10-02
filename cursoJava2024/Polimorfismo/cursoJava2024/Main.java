package cursoJava2024;

public class Main {

	public static void main(String[] args) {
		// Criação de uma conta com saldo iniciqal de R$1000,00
		ContaBancaria conta = new ContaBancaria(5000.00);
		// Exibe o saldo inical:
		System.out.println("Saldo incial:R$" + conta.getSaldo());
		// Realizando um de posito de 500,00:
		conta.depositar(4560.00);
		System.out.println("Saldo incial:R$" + conta.getSaldo());
         //realiza novo deposito:
		conta.depositar(300);
		System.out.println("Saldo incial:R$" + conta.getSaldo());

	}

}