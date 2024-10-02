package cursoJava2024;
import java.util.Scanner;
public class CalculoDoIAC {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua altura em cm: ");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite sua circuferencia do quadril: ");
        double quadril = scanner.nextDouble();
        
        double iac = (quadril /(altura * Math.sqrt(altura))) - 18;
        
        System.out.println(iac );
	}

}
