package br.edu.fatecpg.tecprogramacao;
import java.util.Scanner;

public class NumeroPositivoNegativo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Olá! Digite um número.");
		int num = ler.nextInt();
		
		if(num > 0) {
			System.out.printf("o número %d é positivo.", num);
		}else if(num == 0) {
			System.out.printf("O número %d não é posito nem negativo.", num);
		}else{
			System.out.printf("O número %d é negativo.", num);
		}

		ler.close();

	}

}
