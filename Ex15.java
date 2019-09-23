package edu.ifsp.bra;
import java.util.Random;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.15
 *************  
Crie uma matriz 5x5 preenchendo seus elementos com números inteiros
aleatórios de 0 a 9. Represente a matriz na tela. Trate erros.
*/
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int[5][5];
		
		Random num = new Random(); 
		int numAleatorio= num.nextInt(10);
		
		for (int i = 0 ; i < matriz.length ; i++) {
			for ( int j = 0 ; j < matriz.length ; j++) {
				numAleatorio= num.nextInt(10);
				matriz[i][j] = numAleatorio;
			}
		}
		
		System.out.println("Mostrando a matriz: ");
		
		for (int[] x : matriz) {
		   for (int y : x) {
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}
	}
}
