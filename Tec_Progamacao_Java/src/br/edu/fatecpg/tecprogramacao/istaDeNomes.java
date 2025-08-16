package br.edu.fatecpg.tecprogramacao;
import java.util.Scanner;

public class istaDeNomes {

	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
	        String[] nomes = new String[5];

	        System.out.println("Digite 5 nomes:");
	        for (int i = 0; i < nomes.length; i++) {
	            System.out.println("Digite o nome " + (i + 1) + ":");
	            nomes[i] = ler.nextLine();
	        }

	        System.out.println("Digite mais um nome para pesquisar:");
	        String nomeBusca = ler.nextLine();

	        boolean encontrado = false;
	        for (int i = 0; i < nomes.length; i++) {
	            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
	                encontrado = true;
	                break;
	            }
	        }

	        if (encontrado) {
	            System.out.printf("O nome %s está na lista!\n", nomeBusca);
	        } else {
	            System.out.printf("O nome %s não está na lista!\n", nomeBusca);
	        }

	        ler.close();

	}

}
