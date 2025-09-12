package br.edu.fatecpg.encapsulamento.model;

public class ContaBancaria {

	private String titular;
	private double saldo;
	
	
	public ContaBancaria( String titular,double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double depositar(double valor) {
	
		if(valor <=0) {
			System.out.println("Deposito Inválido!");
		}
		else {
			System.out.println("Deposito realizado!");
		}
		
		return valor;
		
	}
	
	public boolean sacar(double valor) {
		
		if( valor > 0 || valor <= saldo) {
			
			saldo -= valor; 
			System.out.println("Saque realizado com sucesso");
			return true;
		}else {
			
			System.out.println("Saque Inválido!");
			return false;
		}
		
	}
}
