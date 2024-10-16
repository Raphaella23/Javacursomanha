package cursoJava2024;

import java.util.ArrayList;
import java.util.List;

public class SistemaDePagamento {  // Corrigido o nome da classe

    public static void main(String[] args) {
        // Lista para armazenar os pagamentos
        List<Pagamento> listaPagamentos = new ArrayList<>();

        // Adicionando diferentes formas de pagamento na lista
        listaPagamentos.add(new PagamentoCartao());
        listaPagamentos.add(new PagamentoBoleto());
        listaPagamentos.add(new Pagamentopix());

        // Processando os pagamentos e mostrando o status antes e depois
        for (Pagamento pagamento : listaPagamentos) {
            System.out.println("Status antes de processar: " + pagamento.getStatus());
            System.out.println(pagamento.processarPagamento(100.0));
            System.out.println("Status depois de processar: " + pagamento.getStatus());
            System.out.println("------------");
        }
    }
}
