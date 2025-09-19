package br.edu.fatecpg.array2.model;

public class Videolocadora {
	

		
	    private String[] filmes;
	    private int[] vezesAlugado;
	    private double[] precosLocacao;
	    private int qtd;
	    
	    public Videolocadora(int qtd) {
	        this.qtd = qtd;
	        this.filmes = new String[qtd];
	        this.vezesAlugado = new int[qtd];
	        this.precosLocacao = new double[qtd];
	    }
	    
	   
	    public void setFilme(int i, String f, double p) {
	        if (i > 0 && i <= this.qtd) {
	            this.filmes[i - 1] = f;
	            this.precosLocacao[i - 1] = p;
	            this.vezesAlugado[i - 1] = 0; 
	        } else {
	            System.out.println(" Índice inválido.");
	        }
	    }

	 
	    public void getFilmes() {
	        System.out.println("\n=== Filmes ===");
	        for (int i = 0; i < this.qtd; i++) {
	            if (this.filmes[i] != null) {
	                System.out.println("Nome do Filme: " + this.filmes[i]);
	                System.out.println("Preço da Locação: R$" + this.precosLocacao[i]);
	                System.out.println("Vezes Alugado: " + this.vezesAlugado[i]);
	                System.out.println("==============================");
	            }
	        }
	    }

	    
	    public double calcularFaturamentoEsperado() {
	        double faturamentoTotal = 0;
	        for (int i = 0; i < this.qtd; i++) {
	            if (this.filmes[i] != null) {
	                faturamentoTotal += this.precosLocacao[i];
	            }
	        }
	        return faturamentoTotal;
	    }

	 
	    public String filmeMaisAlugado() {
	        int maisVezes = -1;
	        String tituloMaisAlugado = "Nenhum filme alugado.";
	        
	        for (int i = 0; i < this.qtd; i++) {
	            if (this.filmes[i] != null && this.vezesAlugado[i] > maisVezes) {
	                maisVezes = this.vezesAlugado[i];
	                tituloMaisAlugado = this.filmes[i];
	            }
	        }
	        return tituloMaisAlugado;
	    }

	   
	    public void alugarFilme(int i) {
	        if (i > 0 && i <= this.qtd && this.filmes[i-1] != null) {
	            this.vezesAlugado[i-1]++;
	            System.out.println("Filme '" + this.filmes[i-1] + "' alugado com sucesso!");
	        } else {
	            System.out.println(" Filme não encontrado.");
	        }
	    }
	    
	   
	    public void devolverFilme(int i) {
	        if (i > 0 && i <= this.qtd && this.filmes[i-1] != null) {
	            System.out.println(" '" + this.filmes[i-1] + "' foi devolvido. ");
	        } else {
	            System.out.println("Erro: Filme não encontrado ou índice inválido.");
	        }
	    }
	}

