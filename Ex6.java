package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.6
 *************  
Escreva um programa que receba um valor inteiro. Se esse valor for par, ele
escreve uma mensagem na tela sobre isso e pede um novo valor. Se o valor for
ímpar, ele escreve uma mensagem na tela sobre isso e termina. Trate erros.

*/
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um numero inteiro: ");
		valor = Integer.parseInt(entrada.nextLine());
		
		while ( ( valor % 2 ) == 0) {
			System.out.println("O valor digitado é par! Digite novamente um numero inteiro: ");
			valor = Integer.parseInt(entrada.nextLine());
			
			if ( ( valor % 2 ) != 0 ) {
				System.out.println("Valor ímpar, programa finalizado!");
				break;
			}
		}
		entrada.close();
	}

}
