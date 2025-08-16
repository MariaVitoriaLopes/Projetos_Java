package br.edu.fatecpg.tecprogramacao;
import java.util.Scanner;

public class SenhaSecreta {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        String senhaCorreta = "Java123";
        String tentativa = "";

        while (!tentativa.equals(senhaCorreta)) {
            System.out.println("Digite a senha:");
            tentativa = ler.nextLine();

            if (!tentativa.equals(senhaCorreta)) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        }

        System.out.println("Acesso permitido!");
        
        ler.close();

	}

}
