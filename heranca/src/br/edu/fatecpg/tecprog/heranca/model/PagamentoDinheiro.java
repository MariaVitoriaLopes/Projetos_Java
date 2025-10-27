package br.edu.fatecpg.tecprog.heranca.model;

public class PagamentoDinheiro implements IPagamento{
 private double valor;
 private double taxa=0.10;
 
 
 public PagamentoDinheiro(double valor) {
	 this.valor=valor;
	 
 }
 
 public double calcularPagamento() {
	 return valor-(valor*taxa);
 }
 public void emitirRecibo() {
	 System.out.println("valor:"+valor);
	 System.out.println("taxa:"+taxa);
	 System.out.println("valor total:"+ calcularPagamento());
 }
 
}
