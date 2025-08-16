package br.edu.fatecpg.tecprog.estruturacondicao;
import java.util.Scanner;

public class transposicaoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		String[][] elementos = new String[2][2];
		String[][] reverso = new String[2][2];
		
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 2; c++) {
				System.out.println("Digite uma palavra: ");
				elementos[l][c] = ler.nextLine();
			}
		}
		
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 2; c++) {
				reverso[c][l] = elementos[l][c];
			}
		}
		
		for(String[] linha : reverso) {
			for(String coluna : linha) {
				System.out.print(coluna + " | ");
			}
			System.out.println();
		}
		
	}

}
