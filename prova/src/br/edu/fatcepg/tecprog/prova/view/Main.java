package br.edu.fatcepg.tecprog.prova.view;
import br.edu.fatecpg.tecprog.prova.model.*;
public class Main {

	public static void main(String[] args) {
		 System.out.println("================PROVA A=====================");
		        Carro meuCarro = new Carro();
		        meuCarro.marca = "Toyota";
		        meuCarro.modelo = "Corolla";
		        meuCarro.ano = 2020;

		        System.out.println("Marca: " + meuCarro.marca);
		        System.out.println("Modelo: " + meuCarro.modelo);
		        System.out.println("Ano: " + meuCarro.ano);
		        
		        System.out.println("=====================================");
		         Aluno aluno1 = new Aluno();
		               
		                aluno1.setNome("Maria");
		                aluno1.setMatricula("20251001");
		                aluno1.setNotaFinal(8.5);

		                System.out.println("Nome: " + aluno1.getNome());
		                System.out.println("Matrícula: " + aluno1.getMatricula());
		                System.out.println("Nota Final: " + aluno1.getNotaFinal());
		                System.out.println("=====================================");
		                
		                        String[] nomes = {"Paracetamol", "Dipirona", "Ibuprofeno", "Amoxicilina"};
		                        int[] dias = {10, 3, 7, 2};
		                        double[] precos = {10, 5.5, 12.0, 20};

		                        Farmacia farmacia = new Farmacia(nomes, dias, precos);

		                        farmacia.mostrarMedicamentos();

		                        System.out.println("\nMédia de dias para vencimento: " + farmacia.calcularMediaDias());

		                        farmacia.mostrarProximosDeVencer();

		                        farmacia.aplicarDesconto();

		                        System.out.println("\nApós aplicar descontos:");
		                        farmacia.mostrarMedicamentos();

		                        farmacia.venderMedicamento("Dipirona");
		                        farmacia.venderMedicamento("Ibuprofeno");
		                        farmacia.venderMedicamento("Paracetamol");

		                        System.out.println("\nApós venda:");
		                        farmacia.mostrarMedicamentos();
		                        System.out.println("================PROVA B=====================");
		                       
		                                Livro livro1 = new Livro();
		                                livro1.titulo = "Dom Casmurro";
		                                livro1.autor = "Machado de Assis";
		                                livro1.anoPublicacao = 1899;

		                                System.out.println("Título: " + livro1.titulo);
		                                System.out.println("Autor: " + livro1.autor);
		                                System.out.println("Ano de Publicação: " + livro1.anoPublicacao);
		                                
		                                System.out.println("=====================================");
		                                
		                               
		                                        Funcionario f = new Funcionario();
		                                        
		                                        f.setNome("Maria Vitoria");
		                                        f.setSalario(4500.00);
		                                        f.setCargo("Analista de Sistemas");

		                         System.out.println("Nome: " + f.getNome());
		                         System.out.println("Cargo: " + f.getCargo());
		                         System.out.println("Salário: R$" + f.getSalario());
		                         System.out.println("=====================================");
		                                        
		                                   
		                        String[] produtos = {"Arroz", "Feijão", "Leite", "Café"};
		                 	    double[] precosSuper= {25.00, 8.50, 4.80, 15.00};
		                 	    double[] descontos = {0.10, 0.05, 0.0, 0.20};

		                        Supermercado mercado = new Supermercado(produtos, precos, descontos);

		                      mercado.listarProdutosComDesconto();
		                      System.out.printf("\nTotal com descontos: R$ %.2f\n", mercado.calcularTotalComDescontos());
		                      mercado.produtoMaiorEconomia();
		                      System.out.println("================PROVA C=====================");   
		                      
		                     
		                    	        Celular celular = new Celular();

		                    	       
		                    	        celular.marca = "Samsung";
		                    	        celular.modelo = "Galaxy S21";
		                    	        celular.preco = 3999.90;

		                    	      
		                    	        System.out.println("Marca: " + celular.marca);
		                    	        System.out.println("Modelo: " + celular.modelo);
		                    	        System.out.println("Preço: R$ " + celular.preco);
		                    	
		                      
		                      System.out.println("=====================================");
	
		                      Contabancaria conta = new Contabancaria();

		                      
		                      conta.setTitular("Maria Silva");
		                      conta.setNumeroConta(12345);
		                      conta.setSaldo(1500.75);

		                     
		                      System.out.println("Titular: " + conta.getTitular());
		                      System.out.println("Número da Conta: " + conta.getNumeroConta());
		                      System.out.println("Saldo: R$ " + conta.getSaldo());
		                      System.out.println("=====================================");
		                      
		                      Postocombustivel posto = new Postocombustivel();

		                      posto.exibirCombustiveis();
		                      System.out.println("Valor total em estoque: R$ " + posto.calcularValorEstoque());

		                      posto.exibirMaiorEMenorEstoque();

		                      posto.venderCombustivel("Gasolina", 300);
		                      posto.reabastecerCombustivel("Etanol", 200);

		                      System.out.println("\nApós operações:");
		                      posto.exibirCombustiveis();
	}}
		                                    
	
		                                

		                            
		                        

		                

		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
		            
		     
		        
		        
		    
		




