package br.edu.fatecpg.tecprog.estruturacondicao;
import java.util.Scanner;


public class SomaDeMatrizes {

	public static void main(String[] args) {
		//Desenvolva um programa que realiza a soma de duas matrizes 3X3, exibindo o resultado no console. 

		Scanner ler = new Scanner(System.in);
		int[][] nums = {{1,2,3},
					    {4,5,6},
					    {7,8,9}};

		int[][] nums2 = {{9,8,7},
			    		 {6,5,4},
			    		 {3,2,1}};
		
		int[][] soma = new int[3][3];
		
		
		for(int l = 0;l < 3;l++) {
			
			for(int c =0;c < 3;c++) {
				soma[l][c] = nums[l][c] + nums2[l][c];
			}
		}
			
		System.out.println("Resultado: ");
		
		for(int l =0; l < 3;l++) {
			for(int c = 0; c < 3; c++) {
				System.out.print("| " + soma[l][c]+ " |");
			}
			System.out.println();
		}
		
		ler.close();
		
	}

}
