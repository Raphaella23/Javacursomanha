package cursoJava2024;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class OrdenarNomes {

	public static void main(String[] args) {
          List<String> nomes = Arrays.asList("Raphaella", "Mirian","Anisio","Matheus","Gustavo", "letcia");
          
          Collections.sort(nomes);
          
          System.out.print("Nomes em ordem alfabeticas: "+nomes);
	}

}
