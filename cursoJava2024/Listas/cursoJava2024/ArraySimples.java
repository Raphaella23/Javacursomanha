package cursoJava2024;

public class ArraySimples {

	public static void main(String[] args) {
     //Criando um Array de supermercado(lista de compras):
	String[] mercado = {"Arroz", "Açucar", "Danone", "Cafe","Leite"};

	 //Exibindo apenas o terceiro item da lista:
    //System.out.println("Item selecionado: "+ mercado [1]);
	//Todo array começa com ZERO!
     
     //Exibindo todos os item do array:
	//Lendo a linha "intem < mercado.length": Enquando intem for menor do que o comprimento de intem do array, faça algo!
	
         for (int i = 0; i < mercado.length; i++ ) {
    	 System.out.println(mercado [i]);
     }
}
}