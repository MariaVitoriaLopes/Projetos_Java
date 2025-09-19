package br.edu.fatecpg.tecprog.array1.view;
import br.edu.fatecpg.tecprog.array1.model.*;

public class Main {

    public static void main(String[] args) {
        
        Loja lojaDSM = new Loja(3);
        lojaDSM.setProduto(1, "Teclado", 120, 5);
        lojaDSM.setProduto(2, "Mouse", 85, 7);
        lojaDSM.setProduto(3, "Pastel", 12, 50);
        
        lojaDSM.getProdutos();
        
        System.out.println(lojaDSM.produtosDestaque());
        
        System.out.println(lojaDSM.valorTotalEstoque());
    }
}
