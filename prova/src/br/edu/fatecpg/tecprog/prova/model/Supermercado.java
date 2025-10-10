package br.edu.fatecpg.tecprog.prova.model;

public class Supermercado {
	
	    String[] nomesProdutos;
	    double[] precosSuper;
	    double[] descontos; 

	    public Supermercado(String[] nomes, double[] precosSuper, double[] descontos) {
	        this.nomesProdutos = nomes;
	        this.precosSuper = precosSuper;
	        this.descontos = descontos;
	    }

	 
	    public void listarProdutosComDesconto() {
	        System.out.println("Produtos com preços e descontos:");
	        for (int i = 0; i < nomesProdutos.length; i++) {
	            double precoComDesconto = precosSuper[i] * (1 - descontos[i]);
	            System.out.printf("%s: R$ %.2f -> Com desconto: R$ %.2f\n",
	                nomesProdutos[i], precosSuper[i], precoComDesconto);
	        }
	    }

	   
	    public double calcularTotalComDescontos() {
	        double total = 0;
	        for (int i = 0; i < precosSuper.length; i++) {
	            total += precosSuper[i] * (1 - descontos[i]);
	        }
	        return total;
	    }

	 
	    public void produtoMaiorEconomia() {
	        double maiorEconomia = 0;
	        String produto = "";

	        for (int i = 0; i < precosSuper.length; i++) {
	            double economia = precosSuper[i] * descontos[i];
	            if (economia > maiorEconomia) {
	                maiorEconomia = economia;
	                produto = nomesProdutos[i];
	            }
	        }

	        System.out.printf("Produto com maior economia: %s (Economia: R$ %.2f)\n", produto, maiorEconomia);
	    }
	}


