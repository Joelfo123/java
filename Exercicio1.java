//ex1---------------------------------------------------------
//Programa que mostra na tela números pares de 1 até 20 
//Autor: Joel Guerreiro
//Disciplina : Estrutura de Dados I
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int cont = 0;
		int num1;
		int num2;
		
		while (cont <= 20) {
			cont++;
			if ( (cont % 2) == 0)
				System.out.println(cont);
		}
		System.out.println(" ");
	}
}
