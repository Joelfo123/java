package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.3
 *************  
 Escreva um programa que receba um valor n positivo e apresente uma
 contagem regressiva de n até –n. Trate erros.
*/
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero;
		int contador;
		int contador2;
		
		do {
			System.out.println("Digite um número: ");
			numero = Integer.parseInt(entrada.nextLine());
			if ( numero == 0) {
				System.out.println("Numero inválido, fim do programa!");
				break;
			}
		} while ( numero < 0);
		
		contador = numero * -1;
		contador2 = numero;
		
		for(int i = numero; i >= contador; i--) {
			System.out.println("Contagem regressiva...:  " + contador2-- + "!");
		}
		entrada.close();
	 }
}


