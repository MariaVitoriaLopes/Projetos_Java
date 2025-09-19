package br.edu.fatecpg.tecprog.array.model;

public class Biblioteca {
   private String[] livros;
   private int[] diasAtraso;
   private double[] multaPorDia;
   private int qtd;
   public Biblioteca(int qtd) {
       this.qtd = qtd;
       this.livros = new String[qtd];
       this.diasAtraso = new int[qtd];
       this.multaPorDia = new double[qtd];
   }
   public void setLivros(int i, String l, int d, double m) {
    
       this.livros[i] = l;
       this.diasAtraso[i] = d;
       this.multaPorDia[i] = m;
   }
   public void getMostrarLivros() {
       System.out.println("===Livros===");
       for (int i = 0; i < this.qtd; i++) {
           System.out.println("nome: " + livros[i]);
           System.out.println("atraso: " + diasAtraso[i]);
           System.out.println("multa: " + multaPorDia[i]+"\n");
       }
   }
   public double calcularMulta() {
       double multa = 0;
       for (int i = 0; i < livros.length; i++) {
           if (livros[i] != null && diasAtraso[i] > 0) {
               multa += diasAtraso[i] * multaPorDia[i];
           }
       }
       return multa;
   }
   public double mediaDiasAtraso() {
       int qtddias = 0;
       int livrosComAtraso = 0;
       for (int i = 0; i < livros.length; i++) {
           if (livros[i] != null && diasAtraso[i] > 0) {
               qtddias += diasAtraso[i];
               livrosComAtraso++;
           }
       }
       if (livrosComAtraso == 0) {
           return 0;  }
       return (double) qtddias / livrosComAtraso;
   }
   public void emprestarLivro(int i) {

       if (i >= 0 && i < this.qtd && livros[i] != null) {

           System.out.println("Emprestando o livro: " + livros[i]);
           livros[i] = null; 
           diasAtraso[i] = 0;
           multaPorDia[i] = 0;
       } else {
           System.out.println("Erro: Livro não encontrado ou índice inválido.");
       }
   }
   public void devolverLivro(int i, String l, int d, double m) {
       if (i >= 0 && i < this.qtd) {
           this.livros[i] = l;
           this.diasAtraso[i] = d;
           this.multaPorDia[i] = m;

           System.out.println("Devolução registrada para o livro: " + l);
       } else {

           System.out.println("Erro: Índice inválido para devolução.");
       }
   }
}



