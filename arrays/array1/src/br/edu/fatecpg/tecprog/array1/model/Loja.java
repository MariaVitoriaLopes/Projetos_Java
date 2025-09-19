package br.edu.fatecpg.tecprog.array1.model;

public class Loja {
    private String[] nomesProdutos;
    private int[] quantidadeEstoque;
    private double[] precosProdutos;

    private int qtd;

    public Loja(int qtd) {
        this.qtd = qtd;
        nomesProdutos = new String[qtd];
        quantidadeEstoque = new int[qtd];
        precosProdutos = new double[qtd];
    }

    public void setProduto(int i, String n, double p, int q) {
        this.nomesProdutos[i-1] = n;
        this.precosProdutos[i-1] = p;
        this.quantidadeEstoque[i-1] = q;
    }

    public void getProdutos() {
        for(int c = 0; c < this.qtd; c++) {
            System.out.println("Nome Produto: " + this.nomesProdutos[c] + "\n" +
                               "Preço Produto: " + this.precosProdutos[c] + "\n" +
                               "Quantidade Produto: " + this.quantidadeEstoque[c] + "\n");
        }
    }

    public String produtosDestaque() {
        double precoMenor = Double.MAX_VALUE, precoMaior = 0;
        for(int c = 0; c < this.qtd; c++) {
            if(this.precosProdutos[c] > precoMaior) {
                precoMaior = this.precosProdutos[c];
            }
            if(this.precosProdutos[c] < precoMenor) {
                precoMenor = this.precosProdutos[c];
            }
        }
        return "O Maior Preço de Produto é: " + precoMaior + "\n" +
               "O Menor Preço de Produto é: " + precoMenor;
    }

    public double valorTotalEstoque() {
        double valorTotal = 0;
        for(int c = 0; c < this.qtd; c++) {
            valorTotal += this.precosProdutos[c] * this.quantidadeEstoque[c];
        }
        return valorTotal;
    }

    public String comprarProduto(int i, int qtd) {
        if(this.quantidadeEstoque[i-1] >= qtd) {
            this.quantidadeEstoque[i-1] -= qtd;
            return "Obrigado Pela Compra!";
        } else {
            return "Quantidade Inválida!";
        }
    }

    public String reporProduto(int i, int qtd) {
        this.quantidadeEstoque[i-1] = qtd;
        return "Obrigado Pela Devolução!";
    }
}