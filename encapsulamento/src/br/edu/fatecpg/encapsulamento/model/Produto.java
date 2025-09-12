package br.edu.fatecpg.encapsulamento.model;

public class Produto {

	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public Produto(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco < 0) {
			
			this.preco = preco;
		}
		
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		
		if(quantidadeEstoque >= 0) {
			
			this.quantidadeEstoque = quantidadeEstoque;
		}
		
		
	}
	
	
	
	
}
