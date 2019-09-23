package edu.ifsp.bra;
import java.util.Scanner;
/*********************************************
 * 			LISTA 1 BIM - ED1I3				 *
 * *******************************************
 * **NOME: 		JOEL GUERREIRO BORGHI FILHO **
 * **PRONTUÁRIO: BP1762028					**
 * *******************************************
 **********************
 EXERCÍCIO NO.16
 *************  
Usando o menor número possível de matrizes, leia 3 nomes de alunos
(somente valores válidos), leia 2 notas (válidas) para cada um e calcule as
médias. Aprovados a partir de nota 6. Garanta que só dados válidos sejam
informados. Guarde essas informações em memória. Exiba os dados de cada
aluno no formato do exemplo abaixo:
<João da Silva>:
N1: 5,00
N2: 8,00
Média : 6,50
Situação: Aprovado

*/
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alunos[][] = new String[1][3];
		String situacao[][] = new String[1][3];
		Float medias[][] = new Float [1][3];
		Float n1;
		Float n2;
		int cont = 0;
		Scanner entrada = new Scanner(System.in);
		
		//leitura nomes, notas e calculo da media
		
		for (int i = 0 ; i < alunos.length ; i++) {
			for (int j = 0 ; j < alunos[i].length ; j++) {
				cont += 1;
				System.out.printf("Informe o nome do aluno: %d: ", cont);
				alunos[i][j] = entrada.next();
				
				System.out.printf("Informe a nota 1 do aluno %d: ", cont);
				n1 = entrada.nextFloat();
				System.out.printf("Informe a nota 2 do aluno %d: ", cont);
				n2 = entrada.nextFloat();
				
				medias[i][j] = (( n1 + n2) / 2);
				
				if ( (medias[i][j]) >= 6.50 ) 
					situacao[i][j] = "Aprovado";
				else  situacao [i][j] = "Reprovado" ;
			}
		}
		
		for (int i = 0 ; i < alunos.length ; i++) {
			for (int j = 0 ; j < alunos[i].length ; j++) {
				System.out.println("Aluno:  " + alunos[i][j]);
				System.out.printf("Media: %.2f ", medias[i][j]);
				System.out.println(" - Situacao: " + situacao[i][j]);
			}
		}	
		entrada.close();
	}

}
