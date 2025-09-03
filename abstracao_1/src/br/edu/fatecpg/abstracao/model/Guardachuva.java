package br.edu.fatecpg.abstracao.model;

public class Guardachuva {
	public String cor;
	public boolean estado=false;
	
	public void abrir() {
		if(estado==true) {
			System.out.println("O guarda-chuva esta aberto!!!");
		}else {
			System.out.println("O guarda-chuva esta fechado, abra para utilizar");
		}
	}

}
