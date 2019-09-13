package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCICIO NO.1
 *************  
Escreva um programa que recebe um valor n positivo e escreva esse valor n
vezes na tela. Seu programa deve testar e só aceitar valores positivos. Trate
erros.
*/
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Digite um numero: ");
			numero = Integer.parseInt(entrada.nextLine());
			
			if ( numero == 0) {
				System.out.println("Numero invalido, fim do programa.");
			}
		} while ( numero < 0);
		
		for (int i = 0 ; i < numero ; i++)
			System.out.println("Escrevendo na tela No.:" + (i+1) + " = " + numero);
		
		entrada.close();		
	}
}
