package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=====Ônibus=====");
		Onibus onibus1=new Onibus();
		System.out.println("");
		
		System.out.println("Onibus 1:");
		onibus1.motorista="Maria ";
		onibus1.placa="GAY2E19";
		
		System.out.println("Motorista: "+ onibus1.motorista );
		System.out.println("Placa: "+ onibus1.placa );
		System.out.println("===Estado do veículo===");
		
		onibus1.ligar();
		onibus1.acelerar();
	
		Onibus onibus2=new Onibus();
		System.out.println("");
		System.out.println("Onibus 2:");
		
		onibus2.motorista="Vitoria";
		onibus2.placa="GAY3E08";
		
		System.out.println("Motorista: "+ onibus2.motorista );
		System.out.println("Placa: "+ onibus2.placa );
		System.out.println("===Estado do veículo===");
	
		onibus2.ligar();
		onibus2.acelerar();
	
		System.out.println("------------------------");
	
		System.out.println("=====Lampada=====");
		Lampada lampada1=new Lampada();
		System.out.println("");
		System.out.println(" lampada 1:");
		lampada1.cor="branca";
		System.out.println("Cor:"+lampada1.cor);
		System.out.println("==Estado da lampada==");
		lampada1.ligarLampada1();
		
		Lampada lampada2=new Lampada();
		System.out.println("");
		System.out.println(" lampada 2:");
		lampada2.cor="Amarela";
		System.out.println("Cor:"+lampada2.cor);
		System.out.println("==Estado da lampada==");
		lampada2.ligarLampada2();
		System.out.println();
		
		System.out.println("------------------------");
		
		System.out.println("======Espelho======");
		Espelho espelho1=new Espelho();
		System.out.println("Espelho 1");
		espelho1.material="Vidro";
		System.out.println("Material:"+espelho1.material);
		espelho1.refletir();
		
		System.out.println();
		
		Espelho espelho2=new Espelho();
		System.out.println("Espelho 2");
		espelho2.material="Plástico";
		System.out.println("Material:"+espelho2.material);
		espelho2.refletir();
		System.out.println();
		
		System.out.println("------------------------");
		
		System.out.println("=====Guarda-chuva=====");
		Guardachuva gc1=new Guardachuva();
		System.out.println("Guarda-chuva 1");
		gc1.cor="Azul";
		System.out.println("Cor:"+gc1.cor);
		gc1.abrir();
		
		System.out.println();
		
		Guardachuva gc2=new Guardachuva();
		System.out.println("Guarda-chuva 1");
		gc2.cor="Verde";
		System.out.println("Cor:"+gc2.cor);
		gc2.abrir();
		
		System.out.println("------------------------");
		
		System.out.println("=======Sapato=======");
		Sapato sapato1=new Sapato();
		System.out.println("Sapato 1");
		sapato1.tamanho=40;
		System.out.println("tamanho:"+sapato1.tamanho);
		sapato1.usando();
		
		System.out.println();
		
		Sapato sapato2=new Sapato();
		System.out.println("Sapato 2");
		sapato2.tamanho=35;
		System.out.println("Tamanho:"+sapato2.tamanho);
		sapato2.usando2();
		
		
		
		
		
	}

	}


