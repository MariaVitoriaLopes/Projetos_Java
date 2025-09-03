package br.edu.fatecpg.abstracao.model;

public class Lampada {
public String cor;
public boolean ligado=false;



public void ligarLampada1(){
	if(!ligado) {
		System.out.println("A Lâmpada esta ligada");
	}else {
		System.out.println("A lampada esta desligada");
	}
	
}
public void ligarLampada2(){
	if(ligado==false) {
		System.out.println("A Lâmpada esta desligada");
		
	}else {
		System.out.println("A lampada esta ligada");
	}
	
}
}
