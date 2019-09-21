package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.9
 *************  
Escreva um programa que recebe um valor x. Em seguida recebe um novo
valor y. Enquanto y não for múltiplo de x, o programa continua pedindo um novo
valor para y. Quando y for múltiplo de x, encerre o programa. Trate erros.
*/

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("Digite o valor de X: ");
		x = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite o valor de Y: ");
		y = Integer.parseInt(entrada.nextLine());
		
		try {
			while ( (y % x) != 0 ) {
				System.out.println("Y não é multiplo de X!");
				System.out.println("Informe um novo valor para Y: ");
				y = Integer.parseInt(entrada.nextLine());				
				}	
		} catch (ArithmeticException e) {
			System.err.println("Erro: Divisão por zero!");
		} finally {
			System.out.println("Y é multiplo de X, programa encerrado!");
		}
		entrada.close();
		}	
}

