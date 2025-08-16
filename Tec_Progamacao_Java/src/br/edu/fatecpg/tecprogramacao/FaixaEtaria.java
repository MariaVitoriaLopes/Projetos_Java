package br.edu.fatecpg.tecprogramacao;
import java.util.Scanner;
public class FaixaEtaria {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idd = ler.nextInt();
		
		if(idd < 18 && idd > 0) {
			System.out.printf("Você tem %d anos e é menor de idade!", idd);
		}else if(idd >= 18 && idd <= 59) {
			System.out.printf("Você tem %d anos e é um(a) adulto(a)!", idd);
		}else if(idd >= 60) {
			System.out.printf("Você tem %d anos e é um(a) idoso(a)!", idd);	
		}else {
			System.out.printf(" %d não é uma idade válida!", idd);	
		}
		
		ler.close();

	}

}
