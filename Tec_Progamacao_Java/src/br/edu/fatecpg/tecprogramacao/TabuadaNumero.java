package br.edu.fatecpg.tecprogramacao;
import java.util.Scanner;

public class TabuadaNumero {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o número que você quer ver a tabuada:");
		int num = ler.nextInt();
		
		for(int i = 1;i <= 10; i++ ) {
			System.out.println( num + "x" + i + " = " + (num*i));
		}

		ler.close();
		
		

	}

}
