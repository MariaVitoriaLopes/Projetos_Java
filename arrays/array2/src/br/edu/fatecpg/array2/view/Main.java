package br.edu.fatecpg.array2.view;
import br.edu.fatecpg.array2.model.*;

public class Main {

    public static void main(String[] args) {
       
        Videolocadora locadora = new Videolocadora(5);
        
       
        locadora.setFilme(1, "up altas aventuras!", 15.00);
        locadora.setFilme(2, "Meu malvado favorito", 10.00);
        locadora.setFilme(3, "Vingadores", 12.00);
        
      
        locadora.getFilmes();
        
        
        locadora.alugarFilme(2); 
        locadora.alugarFilme(2); 
        locadora.alugarFilme(1);
        
        System.out.println("\n--- lista com alugados ---");
        locadora.getFilmes();
        
        
        System.out.println("\nFilme mais alugado: " + locadora.filmeMaisAlugado());
        
      
        System.out.println("Faturamento total esperado se todos alugassem uma vez: R$" + locadora.calcularFaturamentoEsperado());
        
        
        locadora.devolverFilme(1);
    }
}