package br.edu.fatecpg.abstracao.model;

public class Carro  {
	public String marca, modelo, cor;
	public int ano, capTanque;
	boolean carroLigado = false;
	
	public void ligar(){
		if(!carroLigado) {
			System.out.println("Você ligou seu carro!");
			carroLigado = true;
		}else {
			System.out.println("Seu carro já está ligado!");
		}
	}
	
	public void Buzinar() {
		System.out.println("BIII BIIII BIIIIIII");
	}
	
	public void Acelerar(){
		if(carroLigado) {
			System.out.println("Ham dan dan dan");
		}else {
			System.out.println("O carro está desligado, não da para acelerar.");
		}
	}
	
	public void Desligar(){
		if(carroLigado) {
			System.out.println("Você desligou o carro!");
			carroLigado = false;
		}else {
			System.out.println("Seu carro já está desligado!");
		}
	}
}
