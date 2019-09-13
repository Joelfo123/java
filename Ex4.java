package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.4
 *************  
Altere o programa feito no exercício 1 de forma que a operação seja repetida. O
programa finaliza se o usuário entrar com um valor maior que 500. Trate erros.

*/
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero = 1; // setando a variável para iniciar o laço
		
		while ( numero != 500 ) {
			do {
				System.out.println("Digite um numero: ");
				numero = Integer.parseInt(entrada.nextLine());
				
				if ( numero == 0) {
					System.out.println("Numero invalido, fim do programa.");
				}
			} while ( numero < 0);
			
			for (int i = 0 ; i < numero ; i++)
				System.out.println("Escrevendo na tela No.:" + (i+1) + " = " + numero);
		}
		System.out.println("Você digitou o número 500, programa terminado com sucesso!");
		entrada.close();
	}
}
