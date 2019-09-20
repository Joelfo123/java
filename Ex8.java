package edu.ifsp.bra;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.8
 *************  
Escreva um programa que receba três números a, b e c, sendo a > 1. O
programa deve retornar a soma de todos os valores entre b e c divisíveis por a.
Trate erros.

*/
public class Ex8 {
	
	public static int calculadora(int a, int b, int c) {
		int cont = 0;
		for ( int i = b ; i <= c ; i++) // para i de b até c faça
			if ( (i % a) == 0) 			// se i mod a for zero faça
				cont += i;				// cont recebe cont + i
		
		System.out.println("O resultado do calculo é:");
		return cont;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int c = 10;
		int função;
		
		função = calculadora(a, b, c);
		
		System.out.println(função);
		
	}

}
