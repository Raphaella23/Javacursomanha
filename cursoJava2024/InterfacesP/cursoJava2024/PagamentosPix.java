package cursoJava2024;

public class PagamentosPix implements Pagamento  {
	@Override
public boolean processarPagamento(double valor) {

	
	System.out.println("Pagamento no Pix de R$" + valor+ " Processando...");
	return true;
}

	}
