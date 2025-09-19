package br.edu.fatecpg.tecprog.array.view;
import br.edu.fatecpg.tecprog.array.model.*;
public class Main {
   public static void main(String[] args) {
       
       Biblioteca minhaBiblio = new Biblioteca(3);
       
       minhaBiblio.setLivros(0, "O Senhor dos Anéis", 5, 2.50);
       minhaBiblio.setLivros(1, "A culpa é das estrelas", 3, 6.0);
       minhaBiblio.setLivros(2, "Entendendo algoritmos", 10, 9.50);
       
       minhaBiblio.getMostrarLivros();
       System.out.println("");
      
      
       
     
       System.out.println("====================");
      
       minhaBiblio.emprestarLivro(1);
       minhaBiblio.getMostrarLivros();
       System.out.println("====================");
      
       minhaBiblio.devolverLivro(1, "o senhor dos aneis", 6, 6.5);
       minhaBiblio.getMostrarLivros(); 
       System.out.println("Multa total acumulada: R$" + minhaBiblio.calcularMulta());
       System.out.println("Média de dias de atraso: " + minhaBiblio.mediaDiasAtraso() + " dias");
   }
}





	
	
		

	

