package cursoJava2024;

public class Carro1 implements Veiculo1{
     //Construtor sem parametros(necessario para a linha 'new carroo')
	public Carro1() {
		
	}
	@Override
	public void acelerar() {
		System.out.println("O carro está acelerando...");
	}
	@Override
	public void frear() {
		System.out.println("O carro está freando...");
	}
	
	
	
}
