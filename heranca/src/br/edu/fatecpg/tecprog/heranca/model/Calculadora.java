package br.edu.fatecpg.tecprog.heranca.model;

public class Calculadora implements IOperacaoMatematica {
 
	 public double soma(double a, double b) {
		 return a+b;
	 };
	 public double subtracao(double a, double b) {
		 return a-b;
	 };
	 public double multiplicacao(double a, double b) {
		 return a*b;
	 };
	    public double divisao(double a, double b) {
	    	if(b==0){
	    		System.out.println("nao é possivel dividir por 0");
	    	}
	    	
	    	return a/b; 
			
	    };

}
