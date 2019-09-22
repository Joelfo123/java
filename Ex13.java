package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.13
 *************  
Faça um sistema que peça o primeiro nome de N pessoas (o usuário informa
quantas pessoas serão “cadastradas”) e o ano de nascimento das mesmas e
guarde estas informações em vetores. Calcule a idade delas e também inclua
em um vetor. Ao fim, exiba todos os cadastrados no formato:
Nome – nascido em ano> – idade anos de idade
Nome – nascido em ano> – idade anos de idade
*/
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		
		int tamVetor; // tamanho do vetor
		int anoNascimento = 0;
		int anoAtual = 2019;
		
		System.out.println("Informe a quantidade de pessoas para o cadastro: ");
		tamVetor = Integer.parseInt(entrada.nextLine());
		
		String vetNome[] = new String[tamVetor];
		int idades[] = new int[tamVetor];
		int ano[] = new int[tamVetor];
		
		for ( int i = 0 ; i < vetNome.length ; i++) {
			System.out.println("Informe o nome No." + (i+1) + ":");
			vetNome[i] = entrada.next();
			System.out.println("Informe o ano de nascimento:");
			anoNascimento = Integer.parseInt(entrada.next());
			ano[i] = anoNascimento; 
			anoNascimento = anoAtual - anoNascimento;
			idades[i] = anoNascimento;
		}
		
		for ( int i = 0 ; i < idades.length ; i++) {
			System.out.println("Nome: " + vetNome[i] + " nascido(a) em: " + ano[i]+ " - " + idades[i] + " anos de idade.\n");
		}
		
	}
}
