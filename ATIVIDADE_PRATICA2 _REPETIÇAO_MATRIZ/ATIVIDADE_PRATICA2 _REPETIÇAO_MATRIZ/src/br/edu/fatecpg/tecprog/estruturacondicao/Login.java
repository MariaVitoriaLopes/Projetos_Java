package br.edu.fatecpg.tecprog.estruturacondicao;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		String login, senha;
		String[][] logins = {{"MariaV", "123"},
							 {"MariaC", "321"},
							 {"Bia", "456"},
							 {"Auu", "654"},
							 {"Bla", "789"},
							 {"Caca", "987"}};
		boolean acesso = false;
		
		do {
			System.out.println("login: ");
			login = ler.nextLine();
			
			System.out.println("senha: ");
			senha = ler.nextLine();
			
			for(int i = 0; i < 6; i++) {
					if(login.equals(logins[i][0]) && senha.equals(logins[i][1])){
						acesso = true;
						break;
					}
			}
			if(!acesso) {
				System.out.println("Login ou senha invalidas.");
			}
		}while(acesso == false);
		
		System.out.println("Acesso autorizado!");
	}

}
