package br.edu.fatecpg.tecprogramacao;

import java.util.Scanner;
public class ParOuImpar {

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		int num = ler.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("O número %d é par!", num);
		}else {
			System.out.printf("O número %d é Impar!", num);
		}

		ler.close();

	}

}
