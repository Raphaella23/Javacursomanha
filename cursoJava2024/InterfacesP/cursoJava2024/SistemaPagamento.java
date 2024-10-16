package cursoJava2024;

public class SistemaPagamento{

	public static void main(String[] args) {

		Pagamento cartao = new PagamentoCartao();
		Pagamento Boleto = new PagamentoBoleto();
		Pagamento Pix = new PagamentosPix();
		
		cartao.processarPagamento(100.0);
		Boleto.processarPagamento(50.0);
		Pix.processarPagamento(25.50);
		
		
	}

}
