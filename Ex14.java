package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.14
 *************  
Crie um vetor de 5 posições. Leia um valor para cada posição. Mostre na tela o
vetor NORMAL e o vetor INVERTIDO. Exemplo de saída:
Normal: 2 12 9 6 1
Invertido: 1 6 9 12 2
*/
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int vetor [] = new int [5];
		
		for ( int i = 0 ; i < vetor.length; i++) {
			System.out.println("Digite um valor: ");
			vetor[i] = Integer.parseInt(entrada.nextLine());
		}
		
		System.out.println("Vetor normal: ");
		for ( int i = 0 ; i < vetor.length; i++) {
			System.out.println("\t" + vetor[i]);
		}
		
		System.out.println("Vetor invertido: ");
		for ( int i = vetor.length -1 ; i >= 0 ; i--) {
			System.out.println("\t" + vetor[i]);
		}

		entrada.close();
	}

}
