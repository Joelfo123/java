package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCICIO NO.2
 *************  
Escreva um programa que receba um valor n positivo e escreva uma contagem
regressiva de n até 0. Seu programa deve testar e só aceitar valores positivos.
Trate erros.a
*/

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		int contador;
		
		do {
			System.out.println("Digite um numero: ");
			numero = Integer.parseInt(entrada.nextLine());
			
		} while ( numero < 0 );
		
		contador = numero;
		for(int i = 0 ; i <= numero ; i++) {
			if ( numero == 0) {
				System.out.println("Numero inválido, fim do programa!");
				break;
			}
			System.out.println("Contagem regressiva...: " + contador-- + "!");
		}
		entrada.close();
	}
}
