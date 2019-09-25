package edu.ifsp.bra;
import java.util.Random;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.17
 *************  
Crie uma matriz 5x5 (que deverá ser preenchida quando solicitado com valores
inteiros aleatórios que estejam entre 1 e 50). Mostre um menu com as opções
abaixo e execute a ação correta de acordo com a opção escolhida. Importante:
só permita que o usuário saia do sistema caso ele escolha a opção de sair
explicitamente.
 Trate
 erros.

Opções:
1.
 Carregar/recarregar matriz (dependendo se a matriz tem valores ou não)
2.
 Exibir a soma de todos os elementos
3.
 Exibir a multiplicação de todos os elementos
4.
 Exibir a média de todos os elementos
5.
 Exibir quantos elementos estão acima da média
6.
 Exibir quantos elementos estão abaixo da média
7.
 Pesquisar um número na matriz e retornar a posição LINHA-COLUNA
8.
 Sair

*/
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Random num = new Random();
		int matriz[][] = new int[5][5];
		int numAleatorio = num.nextInt(50);
		int opcao = 0;
		int somador = 0;
		int multiplicador = 1;
		int acimaMedia = 0;
		int abaixoMedia = 0;
		int linha = 0;
		int coluna = 0;
		int numero = 0;
		float mediaElementos = 0;
		boolean condicao = true; //controle do laço
		
		
		while ( (condicao) == true ) {
			System.out.println("<---------------------------------------------------------------------------->");
			System.out.println("<                              | MENU |                                      >");
			System.out.println("<---------------------------------------------------------------------------->");
			System.out.println("< Opções   | Ações                                                           >");
			System.out.println("<---------------------------------------------------------------------------->");
			System.out.println("| OPÇÃO (1)| Carregar/recarregar matriz                                      |");
			System.out.println("| OPÇÃO (2)| Exibir a soma de todos os elementos                             |");
			System.out.println("| OPÇÃO (3)| Exibir a multiplicação de todos os elementos                    |");
			System.out.println("| OPÇÃO (4)| Exibir a média de todos os elementos                            |");
			System.out.println("| OPÇÃO (5)| Exibir quantos elementos estão acima da média                   |");
			System.out.println("| OPÇÃO (6)| Exibir quantos elementos estão abaixo da média                  |");
			System.out.println("| OPÇÃO (7)| Pesquisar um número na matriz e retornar a posição LINHA-COLUNA |");
			System.out.println("| OPÇÃO (8)| SAIR                                                            |");
			System.out.println("<---------------------------------------------------------------------------->\n");
			
			try {
				System.out.println("Digite sua opção: ");
				opcao = Integer.parseInt(entrada.nextLine());
				
			} catch (NumberFormatException e) {
				System.err.println("Valor de entrada invalido \n");
			}	
		
			switch ( opcao ) {
				case 1: //Carregar/recarregar matriz 
					System.out.println("OPÇÃO: 1 SELECIONADA!");
					
					for (int i = 0 ; i < matriz.length ; i++) {
						for ( int j = 0 ; j < matriz[i].length ; j++) {
							numAleatorio = num.nextInt(50);
							matriz[i][j] = numAleatorio;
						}
					}
					System.out.println("Matriz carregada/recarregada!\n");
					for (int[] x : matriz) {
						   for (int y : x) {
						        System.out.print(y + " |");
						   }
						   System.out.println("");
						}
					System.out.println(" ");
					break;
				
				case 2: //Exibir a soma de todos os elementos
					System.out.println("OPÇÃO: 2 SELECIONADA!");
					
					//somando elementos
					for (int i = 0 ; i < matriz.length ; i++) {
						for ( int j = 0 ; j < matriz[i].length ; j++) {
							somador += matriz[i][j];
						}
					}
					System.out.printf("A soma de todos elementos da matriz é = %d: \n", somador);
					System.out.println(" ");
					break;
				
				case 3: //Exibir a multiplicação de todos os elementos 
					System.out.println("OPÇÃO: 3 SELECIONADA!");
					//multiplicando elementos
					for (int i = 0 ; i < matriz.length ; i++) {
						for ( int j = 0 ; j < matriz[i].length ; j++) {
							multiplicador *= matriz[i][j];
						}
					}
					System.out.printf("A multiplicação de todos elementos da matriz é = %d: \n", multiplicador);
					System.out.println(" ");
					break;
				
				case 4: //Exibir a média de todos os elementos
					System.out.println("OPÇÃO: 4 SELECIONADA!");
					
					for (int i = 0 ; i < matriz.length ; i++) {
						for ( int j = 0 ; j < matriz[i].length ; j++) {
							somador += matriz[i][j];
						}
					}
					
					mediaElementos = somador / 2;
					
					System.out.printf("A média dos elementos da matriz é: %.2f", mediaElementos);
					System.out.println(" ");
					break;	
				
				case 5: //Exibir quantos elementos estão acima da média 
					System.out.println("OPÇÃO: 5 SELECIONADA!");
					
					for (int i = 0 ; i < matriz.length ; i++) {
						for ( int j = 0 ; j < matriz[i].length ; j++) {
							if ( (matriz[i][j]) > mediaElementos ) {
								acimaMedia += 1;
							}
						}
					}
					System.out.printf("A matriz tem: %d elementos acima da média.", acimaMedia);
					System.out.println(" ");
					break;
				
				case 6: // Exibir quantos elementos estão abaixo da média  
					System.out.println("OPÇÃO: 6 SELECIONADA!");
					
					for (int i = 0 ; i < matriz.length ; i++) {
						for ( int j = 0 ; j < matriz[i].length ; j++) {
							if ( (matriz[i][j]) < mediaElementos ) {
								abaixoMedia += 1;
							}
						}
					}
					System.out.printf("A matriz tem: %d elementos abaixo da média.", abaixoMedia);
					System.out.println(" ");
					break;
				
				case 7:
					System.out.println("OPÇÃO: 7 SELECIONADA!");
					System.out.println("Digite um número para ser pesquisado na matriz: ");
					numero = Integer.parseInt(entrada.nextLine());
					
					System.out.println("Buscando...");
					for (int i = 0 ; i < matriz.length ; i++) {
						for ( int j = 0 ; j < matriz[i].length ; j++) {
							if ( ( numero ) == matriz[i][j] ) {
								linha =  i;
								coluna = j;
							} 
						}		
					}
					System.out.printf("%d foi encontrado na linha: %d ; coluna: %d ", numero, linha, coluna);
					System.out.println("");
					System.out.println("\n");
					break;
					
				case 8: //SAIR
					condicao = false;
					System.out.println("OPÇÃO: 8 SAIR SELECIONADA, FIM DO PROGRAMA!");
					break;
				}
			}
		entrada.close();
	}
}

