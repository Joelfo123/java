package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.11
 *************  
Repita o Exercício 10, porém, para cada conta da tabuada do número inserido
pelo usuário, o usuário que deve responder com o resultado. O programa então
deve apresentar se o valor inserido pelo usuário foi correto ou não e passar
para a próxima conta. No final, o programa apresenta quantas respostas certas
o usuário teve e a porcentagem de acertos correspondente. Trate erros.

*/
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opcao;
		int valor;
		int cont = 1;
		int contAcertos = 0;
		int contErros = 0;
		int valorUsuario;
		int percentualAcertos;
		int percentualErros;
		
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
				
				System.out.printf("Informe o valor do resultado do cálculo de %d X %d : ", valor, i);
				valorUsuario = Integer.parseInt(entrada.nextLine());
				
				if ( valorUsuario == cont) {
					System.out.println("O valor que você inseriu está correto!\n");
					contAcertos += 1;
				} else {
					System.out.println("O valor que você inseriu está incorreto!\n");
					contErros += 1;
				}
				
				System.out.printf("%d X %d é = %d \n", valor, i, cont);
				System.out.println(" ");
			}
			
			percentualAcertos = contAcertos * 10;
			System.out.println(" ");
			
			System.out.println("<--------------------------------->");
			System.out.println("<----       RESULTADO         ---->");
			System.out.println("<--------------------------------->");
			
			System.out.printf("Você acertou %d respostas!\n", contAcertos);
			System.out.printf("Total de: %d porcento de acertos!\n", percentualAcertos);
			
			percentualErros = contErros * 10;
			
			System.out.printf("Você errou %d respostas!\n", contErros);
			System.out.printf("Total de: %d porcento de erros!\n", percentualErros);
			System.out.println("<--------------------------------->");
			System.out.println("< Programa finalizado com sucesso!>");
			System.out.println("<--------------------------------->");
			System.out.println("<----           FIM           ---->");
			System.out.println("<--------------------------------->");
		} else if ( opcao == 2) {
			System.out.println("Voce digitou opção (2) para sair, fim do programa!");
			} else {
				System.out.println("Valor inválido, fim do programa!");
			}
		entrada.close();
	}

}
