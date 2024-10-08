package cursoJava2024;

public class CriarVeiculo {

	public static void main(String[] args) {
     Carro carro1 = new Carro("Bmw", "X6", 2023 , 4);
     Carro carro2 = new Carro("Fiesta", "Ford", 2015,4);{
	 Carro carro3 = new Carro("Porsche", "Gt3", 2020,4);
     }
     //Exibindo carros
     System.out.println("Detelhes do Carro 1");
     carro1.exibirDetalhes();	
    System.out.println("Detalhes do Carro 2");
    carro2.exibirDetalhes();
    System.out.println("Detalhes do carro 3");
 
    }
}
