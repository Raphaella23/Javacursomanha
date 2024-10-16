package cursoJava2024;

public class PagamentoCartao implements Pagamento {

	@Override
	public boolean processarPagamento(double valor) {
		System.out.println("Pagamento no cartão de R$ " + valor + " processando...");
		return false;
	}

}
