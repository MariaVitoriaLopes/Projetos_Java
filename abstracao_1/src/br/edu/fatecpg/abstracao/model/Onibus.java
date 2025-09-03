package br.edu.fatecpg.abstracao.model;

public class Onibus {
	public String motorista;
	public String placa;
	public boolean ligado=false;


	 
	 public void ligar(){
	if(!ligado){ 
		System.out.println("ônibus ligado");
		}
	 }
	 
	public void acelerar() {
		if(!ligado) {
		System.out.println("ônibus acelerando...");
	}else {
		System.out.println("O Ônibus esta desligado!  ligue para depois acelerar");
		
		}
	}
}