package br.edu.fatecpg.tecprogramacao;
import java.util.Scanner;
public class MenuAreaQuadradoCirculo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Olá! Escolha uma opção:");
		System.out.println("┌──────────────────────────────┐\n"
					     + "│ 1. Calcular área do quadrado │\n"
				         + "│ 2. Calcular área do círculo  │\n"
				         + "└──────────────────────────────┘");
		int opcao = ler.nextInt();
		
		double area;
		switch (opcao) {
	    case 1:
	        System.out.println("Digite o valor do lado:");
	        double lado = ler.nextDouble();
	        area = Math.pow(lado, 2); // lado²
	        System.out.printf("A área do seu quadrado é %.2f", area); //.2 -> duas casas decimais depois da virgula , f --> double
	        break;

	    case 2:
	        System.out.println("Digite o valor dop raio do circulo:");
	        double raio = ler.nextDouble();
	        area = Math.PI * Math.pow(raio, 2);
	        System.out.printf("A área do seu circulo é %.2f", area);
	        break;

	    default:
	        System.out.println("Opção inválida");
	        break;
	}
		
		ler.close();

	}

}
