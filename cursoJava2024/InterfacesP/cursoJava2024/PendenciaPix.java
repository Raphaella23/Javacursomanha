package cursoJava2024;

public class PendenciaPix {
private String status;

public PendenciaPix() {
	this.status = "Pendente";
}
public String processarPagamento(double valor) {
	this.status = "Processando";
	return "Pagamento com Pix de R$"+ valor+ "processo...";
}
public String getStatus() {
	return this.status;
}
}
