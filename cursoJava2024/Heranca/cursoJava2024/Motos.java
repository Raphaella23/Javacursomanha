package cursoJava2024;

public class Motos extends Veiculo1 {
   private boolean temBagageiro;
   
   public Motos(String marca, String modelo, int ano, boolean temBagageiro) {
   super(marca,modelo, ano);
   this.temBagageiro = temBagageiro;
   }
   
   @Override
   public void exibirDetalhes() {
	   System.out.println("Tem bagageiro: "+ (temBagageiro ? "sim" : "Não"));
   //
	   { 
	    Motos moto1 = new Moto("Bmw","1200", 2020,4);
		Motos moto2 = new Moto("Xre","160",2009,4);
		Motos moto3 = new moto("Kawasaki", "650", 2020,4);
	    
		System.out.println("Detalhes da Moto 1");
	    moto1.exibirDetalhes();
	    System.out.println("Detalhe da Moto 2");
	    moto2.exibirDetalhes();
	    System.out.println("Detalhes da Moto 3");
	    moto3.exibirDetalhes();
	}
   
}
}