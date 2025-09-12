package br.edu.fatecpg.encapsulamento.model;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private double capacidadeTanque;
	
	public Carro(String marca,String modelo,int ano, double capacidadeTanque){
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
		this.capacidadeTanque=capacidadeTanque;
	}
public void setMarca(String marca) {
	this.marca=marca;
	
}
public void setModelo(String modelo) {
    this.modelo=modelo;
	
}
public void setAno(int ano) {
	this.ano=ano;
	
}
public void setCapacidadeTanque(double capacidadeTanque) {
	this.capacidadeTanque=capacidadeTanque;
}
public String getMarca() {
	return this.marca;
}
public String getModelo() {
	return this.modelo;
}
public int getAno() {
	return this.ano;
}
public double getCapacidadeTanque() {
	return capacidadeTanque;
}
public double calcularCapacidade(double preçoGasolina) {
	return preçoGasolina*capacidadeTanque;
}

}
