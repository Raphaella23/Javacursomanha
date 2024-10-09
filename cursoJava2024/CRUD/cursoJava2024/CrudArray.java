package cursoJava2024;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class CrudArray {
	//Arrays para armazenar nomes e idades:
	static String[] nomes = new String[10];
	static int[] idades = new int [10];
	static int contador = 0;
	
	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int opcao;
     
     do {
    	 System.out.println("\n--- MENU ---");
    	 System.out.println("1.Adicionar usuário");
    	 System.out.println("2.Exibir usuário");
    	 System.out.println("3.Atualizar usuário");
    	 System.out.println("4.Deteleta usuário");
    	 System.out.println("5.Sair");
    	 opcao = scanner.nextInt();

    	 switch(opcao) {
    	 case  1:
    		 adicionarUsuario(scanner);
    			 break;
    	 case  2:
    		 exibirUsuarios();
                 break;
    	 case  3:
    		 atualizarUsuario(scanner);
    		 break;
    	 case  4:
    		 deletaUsuario(scanner);
    		 break;
    	 case  5:
    		 System.out.println("Saindo do sistema...!");
    		 break;
    		default:
    			System.out.println("Opcção invalida!");
    		 }
    	 }
    	 while (opcao != 5);
    	 scanner.close();
    	 
     }		
		//Criar todos os metodos:
        //Adicionar usuário:
     public static void adicionarUsuario(Scanner scanner) {
    	 if (contador < nomes.length) {
    		 //Pegando nome do usuario:
    		 System.out.println("Digite o nome: ");
    		 String nome = scanner.next();
    		 //Pegando idade do usuario:
    		 System.out.println("Digite a idade");
    		 int idade = scanner.nextInt();   
    		 //Adicionando as variaveis dentros do arrays:
    		 nomes[contador] = nome;
    		 idades [contador] = idade;
    		 contador++;
             System.out.println("Usuário adicionado com sucesso!");
    	 }else{
           System.out.println("Limite de usuário atingido!");    		 
    		 
    	 }
    	 
	}
     //Exibir usuário:
     public static void exibirUsuarios() {
    	 if (contador == 0) {
    		 System.out.println("Nenhum Ususario cadastrado!");
    	 } else {
    		 for (int i = 0; i < contador; i++) {
    	 System.out.println((i + 1) +"Nome: "+  nomes[i]  +", Idade"+  idades[i]);
    		 }
    	 } 
    	 }
     //atualiza usuário:
     public static void atualizarUsuario(Scanner scanner) {
    	 System.out.println("Digite o numero do usuário a ser atualizado: ");
    	int index = scanner.nextInt() - 1;
    	
    	if (index >= 0 && index < contador) {
    	
    		System.out.println("Digite o novo nome: ");
    		String nome = scanner.next();
    	    System.out.println("Digite a nova idade: ");
    		int idade = scanner.nextInt();
    		//jogando nome e idade novo dentro do array
    		nomes [index]= nome;
    		idade [index]= idade;
    		System.out.println("Usuário atualizado com sucesso!");
    		
    	}else {
            System.out.println("Usuário nao encontrado!");
   	}	
    	}
     
     public static void deletaUsuario(Scanner scanner) {
    	 
    	 System.out.println("Digite o numero do usuário a ser deletado:");
    	 int index = scanner.nextInt() - 1;
	
    	 if (index >= 0 && index < contador ) {
    		 for (int i = index; i < contador -1; i++ ){
    			 nomes [i] = nomes [i+1];
    			 idades [i] = idades [i+1];
    		 }
    		 nomes[contador -1] = null;
    		 idades[contador - 1] = 0;
    		 System.out.println("Usuário deletado com sucesso! ");
    	 }else {
             System.out.println("Usuário não localizado! ");				
			}
    	 }
    		 
    		
    	 }
    	
    	
    	
    
        
     
     
     
	
