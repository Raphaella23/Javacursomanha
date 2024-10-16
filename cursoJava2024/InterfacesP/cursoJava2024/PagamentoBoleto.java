package cursoJava2024;

public class PagamentoBoleto implements Pagamento {
	
	@Override
public boolean processarPagamento(double valor) {
		System.out.println("Pagamento no boleto de R$" + valor + " Processando...");
		return true;
	}
}
