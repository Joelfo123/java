package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.10
 *************  
Faça um programa que apresente um menu com as opções 1 e 2. Se o usuário
digitar a opção 2, o programa se encerra. Se o usuário digitar a opção 1, o
programa pede para que o usuário entre com um valor de 1 a 9. O programa,
então, apresenta a tabuada do valor digitado pelo usuário e é finalizado. Teste
todas as entradas do usuário para se certificar que foram inseridos valores
válidos (o primeiro valor pedido só deve receber 1 ou 2 e o segundo valor
pedido só deve receber valores entre 1 e 9). Trate erros.
*/
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opcao;
		int valor;
		int cont = 1;
		System.out.println("<----------------------------->");
		System.out.println("<            menu             >");
		System.out.println("<----------------------------->");
		System.out.println("|      OPÇÃO (1) TABUADA      |");
		System.out.println("|      OPÇÃO (2) SAIR         |");
		System.out.println("<----------------------------->");
	
		opcao = Integer.parseInt(entrada.nextLine());
		
		if ( ( opcao > 0 ) && ( opcao < 2 ) ) {
			System.out.println("Informe um valor de 1 a 9: ");
			valor = Integer.parseInt(entrada.nextLine());
			
			while (true) {
				if ( ( valor < 1) || (  valor > 9 ) ) {
					System.out.println("Valor invalido, digite outro valor: ");
					valor = Integer.parseInt(entrada.nextLine());
				} else {break;}
			}
			
			for( int i = 1 ; i <= 10 ; i++) {
				cont = valor * i ;
				System.out.printf("%d x %d = %d \n", valor, i, cont);
			}
			System.out.println("Programa finalizado com sucesso!");
		} else if ( opcao == 2) {
			System.out.println("Voce digitou opção (2) para sair, fim do programa!");
			} else {
				System.out.println("Valor inválido, fim do programa!");
			}
		entrada.close();
	}

}
