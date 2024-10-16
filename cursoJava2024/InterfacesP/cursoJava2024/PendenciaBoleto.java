package cursoJava2024;

public class PendenciaBoleto {
private String status;

public PendenciaBoleto() {
	this.status= "Pendente";
}
public String processarPagamento(double valor) {
	this.status = "processando";
	return "Pagamento no boleto de R$" + valor + "processando..";
	
	}
public String getStatus() {
	return this.status;
}
}
