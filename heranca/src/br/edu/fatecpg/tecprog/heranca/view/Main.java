package br.edu.fatecpg.tecprog.heranca.view;
import br.edu.fatecpg.tecprog.heranca.model.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.soma(10, 5));
        System.out.println("Subtração: " + calc.subtracao(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicacao(10, 5));
        System.out.println("Divisão: " + calc.divisao(10, 5));
        

    
       System.out.println("===========================================================");
       System.out.println("");

       PagamentoCartao pagamentoCartao2 = new PagamentoCartao(100);
       
       pagamentoCartao2.emitirRecibo();
       pagamentoCartao2.calcularPagamento();
       System.out.println("");
       PagamentoDinheiro pagardinheiro=new PagamentoDinheiro(100);
       
       pagardinheiro.emitirRecibo();
       pagardinheiro.calcularPagamento();
       
       System.out.println("===========================================================");
       System.out.println("");
       
      
       

      
               Scanner sc = new Scanner(System.in);
               SistemaDeSeguranca sistema = new SistemaDeSeguranca();

               boolean logado = false;

               
               while (!logado) {
                   System.out.print("Digite o usuário: ");
                   String usuario = sc.nextLine();

                   System.out.print("Digite a senha: ");
                   String senha = sc.nextLine();

                   logado = sistema.login(usuario, senha);
               }

               
               System.out.println("\nBem-vindo ao sistema, admin!");

               
               System.out.print("Deseja fazer logout? (s/n): ");
               String resposta = sc.nextLine();

               if (resposta.equalsIgnoreCase("s")) {
                   sistema.logout();
               } else {
                   System.out.println("Sessão mantida");
               }

               sc.close();
           }
       

    }
    
    
   
        
    




