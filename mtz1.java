package vetandmtz;
import java.util.Scanner;
public class mtzex {

	public static void main(String[] args) {
		

		Scanner leitor = new Scanner(System.in); 
		// Declarando uma matriz
		String agenda[][] = new String[10][5]; 
		// iniciando um Loop For primário
		for (int i = 0; i < agenda.length; i++) { 
			// declaração de uma variável
			int x = 0; 
			// imprimindo mensagem
			System.out.println("Digite o seu nome: ");  
			// recebendo a resposta dentro da matriz
			agenda[i][x] = leitor.next(); 

			x++; // Contador que adiciona 1 ao valor de X
			
			// imprimindo mensagem na tela
			System.out.println("Digite o seu endereço: "); 
			// recebendo a resposta dentro da matriz
			agenda[i][x] = leitor.next(); 

			x++; // Contador que adiciona 1 ao valor de X
			
			// imprimindo mensagem na tela
			System.out.println("Digite o seu Codigo Postal: "); 
			// recebendo a resposta dentro da matriz
			agenda[i][x] = leitor.next(); 

			x++; // Contador que adiciona 1 ao valor de X
			
			// imprimindo mensagem na tela
			System.out.println("Digite o seu Bairro: "); 
			// recebendo a resposta dentro da matriz
			agenda[i][x] = leitor.next(); 

			x++; // Contador que adiciona 1 ao valor de X
			
			// imprimindo mensagem na tela
			System.out.println("Digite o seu Telefone: ");
			// recebendo a resposta dentro da matriz
			agenda[i][x] = leitor.next(); 

		}

		for (int l = 0; l < 10; l++) { // iniciando um loop For secundário
			for (int j = 0; agenda[l] != null && j < agenda[l].length; j++) { // iniciando um loop For terciário 
																				
				// imprimindo mensagem na tela							 
				System.out.print(agenda[l][j] + " "); 
			}
			// imprimindo mensagem final 
			System.out.println(); 
		}

	}

}