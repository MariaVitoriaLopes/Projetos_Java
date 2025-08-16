package br.edu.fatecpg.tecprogramacao;
import java.util.Scanner;

public class CompararDoisNumeros {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		System.out.println("Olá! Digite o primeiro número inteiro:");
		int num1 = ler.nextInt();
		
		System.out.println("Agora o segundo número inteiro:");
		int num2 = ler.nextInt();
		
		if (num1 > num2) {
		    System.out.printf("O primeiro número, %d, é maior que o segundo número, %d, e eles são diferentes.", num1, num2);
		} else if (num2 > num1) {
		    System.out.printf("O segundo número, %d, é maior que o primeiro número, %d, e eles são diferentes.", num2, num1);
		} else {
		    System.out.printf("O primeiro e segundo número, %d, são iguais!", num1);
		}
		
		ler.close();


	}

}
