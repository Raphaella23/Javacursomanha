package cursoJava2024;

public class Bicicleta implements Veiculo1{
     //Construtor sem parametros(necessario para a linha 'new bicicleta')
	public Bicicleta() {
		
	}
	@Override
	public void acelerar() {
		System.out.println("A bicicleta está acelerando...");
	}
	@Override
	public void frear() {
		System.out.println("A bicicleta está freando...");
	}
	
	
	
}
