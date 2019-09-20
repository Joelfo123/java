package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.7
 *************  
Faça um programa que use a estrutura switch/case. O usuário deve entrar com
um valor entre 0 e 4 e, para cada valor, uma frase diferente deve ser impressa
na tela. Faça também uma opção default. Execute o programa colocando o
break em cada case e depois execute o mesmo programa sem o break em cada
opção. Explique o que acontece. Trate erros.

*/
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		
		//Execução com break ----------------------------------------------------------------------
		System.out.println("Digite um valor: ");
		valor = Integer.parseInt(entrada.nextLine());
		
		switch (valor) {
			case 0:
				System.out.println("Valor digitado = zero!");
				break;
			case 1:
				System.out.println("Valor digitado = 1");
				break;
			case 2:
				System.out.println("Valor digitado = 2");
				break;
			case 3:
				System.out.println("Valor digitado = 3");
				break;
			case 4:
				System.out.println("Valor digitado = 4");
				break;
			default:
				System.out.println("Valor não está entre 0 e 4!");
		}
		
		//Executando sem o break -------------------------------------------------------------------
		System.out.println("");
		System.out.println("Execução sem o break!");
		System.out.println("");
		System.out.println("Digite um valor: ");
		valor = Integer.parseInt(entrada.nextLine());
		
		switch (valor) {
			case 0:
				System.out.println("Valor digitado = zero!");
				//break;
			case 1:
				System.out.println("Valor digitado = 1");
				//break;
			case 2:
				System.out.println("Valor digitado = 2");
				//break;
			case 3:
				System.out.println("Valor digitado = 3");
				//break;
			case 4:
				System.out.println("Valor digitado = 4");
				//break;
			default:
				System.out.println("Valor não está entre 0 e 4!");
		}
		
		/*EXPLICAÇÃO:
		
		1. AO REMOVER O BREAK E DIGITAR O VALOR DE ENTRADA ZERO, O PROGRAMA EXECUTA TODAS CONDIÇÕES INCLUSIVE A DEFAULT.
	    
	    2. AO DIGITAR VALORES DE 1 A 4 SEM O BREAK O PROGRAMA EXECUTA TODAS CONDIÇÕES A PARTIR DO NÚMERO INFORMADO INCLUSIVE A DEFAULT.
	    
	    3.AO DIGITAR UM VALOR NEGATIVO ELE CONSIDERA QUE O NÚMERO NÃO ESTÁ ENTRE 0 E 4 NAS DUAS EXECUÇÕES, COM E SEM BREAK.
	    
	    */
		entrada.close();
	}

}
