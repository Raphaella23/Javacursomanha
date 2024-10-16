package cursoJava2024;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimiteESkip {
       public static void main(String[] args) {
    	   
    	   List<Integer> numeros = Arrays.asList(10,20,30,40,50,60,70,80,90);
    	   
    	   List<Integer> tresPrimeiros = numeros.stream()
    			              .limit(3)
    			              .collect(Collectors.toList());
    	   System.out.println("Três primeiros elementos:" + tresPrimeiros);
    	   
    	   List<Integer> aposDoisPrimeiros = numeros.stream()
                                             .skip(2)
                                             .collect(Collectors.toList());
    	   
          System.out.println("Após pular os dois primeiros: "+ aposDoisPrimeiros);
    	   
    	   
       }
	
	
	
	
	
	
	
	
}
