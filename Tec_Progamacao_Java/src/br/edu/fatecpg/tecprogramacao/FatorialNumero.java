package br.edu.fatecpg.tecprogramacao;
import java.util.Scanner;

public class FatorialNumero {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número para ver o fatorial: ");
		int num = ler.nextInt();
		int resultado = 1; // variável acumuladora

		for (int i = num; i >= 1; i--) {
		    resultado = resultado * i;  // acumula o produto
		}

		System.out.printf("O fatorial de %d é %d", num, resultado);

		ler.close();
	}

}
