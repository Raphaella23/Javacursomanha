package cursoJava2024;

public class Carro  extends Veiculo1{

     private int numeroDePortas;
     
     public Carro(String marca, String modelo, int ano, int numeroDePortas) {
     super(marca, modelo,ano);
     this.numeroDePortas = numeroDePortas;
     }     
     
     @Override
     public void exirbirDetalhes() {
    	 super.exibirDetalhes();
    	 System.out.println("Numero de Portas:"+ numeroDePortas);
     }

}
