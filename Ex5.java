package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.5
 *************  
Faça um programa que leia n1 e n2, inteiros positivos. Os valores de n1 e n2
não podem ser, ao mesmo tempo 0. Se um deles for 0, tudo bem. Se n1 for 0,
mostre uma contagem regressiva de n2 até 0; caso contrário, se n2 for 0,
mostre uma contagem regressiva de n1 até 0. Trate erros.

*/
public class Ex5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.println("Digite o valor de n1: ");
		n1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite o valor de n2: ");
		n2 = Integer.parseInt(entrada.nextLine());
		
		if ((( n1 == 0) && ( n2 == 0)) || ( n1 == n2)) {
			System.out.println("Os dois numeros são zero ou iguais, programa finalizado!");
		} else {
			if (( n1 == 0 ) && ( n2 != 0)) {
				System.out.println("N1 é zero, então faremos uma contagem regressiva de n2 até 0: ");
				for ( int i = n2 ; i >= 0 ; i--) {
					System.out.println(i);
				}
			} else {
				System.out.println("N2 é zero, então faremos uma contagem regressiva de n1 até 0");
				for ( int i = n1 ; i >= 0 ; i--) {
					System.out.println(i);
				}
			}
		}
		entrada.close();
	}
}
