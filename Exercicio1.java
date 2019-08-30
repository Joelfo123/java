package edu.bra.ifsp;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 0;
		int cont2= 0;
		int num1;
		int num2;
		
		Scanner entrada = new Scanner(System.in);
		
		//ex1---------------------------------------------------------
		while (cont <= 20) {
			cont++;
			if ( (cont % 2) == 0)
				System.out.println(cont);
		}
		
		System.out.println(" ");
		
		//ex2
		System.out.println("Digite o primeiro numero: ");
		num1 = Integer.parseInt(entrada.next()); //1
		
		System.out.println("Digite o segundo numero: ");
		num2 = Integer.parseInt(entrada.next()); //2
	
		while (num1 <= num2) {
			num1++;
			System.out.println(num1);
			if (num1 == num2) {
				break;
			}
		}
	}
