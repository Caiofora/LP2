package Pacote_Principal;

import java.util.Scanner;

public class Calculadora {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Digite o primeiro numero");
		numero1 = entrada.nextInt();
		System.out.println("Digite o segundo numero");
		numero2 = entrada.nextInt();
		
		
		soma(numero1, numero2);
		
	
	}
	static void soma(int x, int y) 
	{
		int total = x+y;
		System.out.println("a soma é " + total);
		
	}

}
