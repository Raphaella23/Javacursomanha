package cursoJava2024;

public class PendenciaCartao {
private String status;
 
public PendenciaCartao() {
	this.status = "Pendente";
}
public String processarPagamento(double valor) {
	this.status ="Processando";
	return "Pagamento no cartão de crédito de R$"+valor+ "Processando";
	
}
public String getStatus() {
	return this.status;
}
}
