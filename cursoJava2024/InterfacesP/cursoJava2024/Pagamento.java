package cursoJava2024;

public interface Pagamento {
    boolean processarPagamento(double valor);

	String getStatus();
}
