//Programa que recebe dois números inteiros e mostra a soma na tela
import java.util.Scanner;

public Class Somador
{
    public static void main(String[] args)
    {
        Scanner input = New Scanner (System.in);
        
        int numero1;
        int numero2;
        int soma;
    
        System.out.println("Entre com o primeiro numero por favor: ");
        numero1 = input.nextInt();
    
        System.out.println("Entre com o segundo numero por favor: ");
        numero2 = input.nextInt();
    
        soma = numero1 + numero2;
    
        System.out.println("A soma dos dois numeros deu: %d%n ", soma);
     }
}
