package br.edu.fatecpg.encapsulamento.view;
import java.util.Scanner;
import br.edu.fatecpg.encapsulamento.model.*;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Carro meuCarro= new Carro("logan","renault",2020,14);
		
		 System.out.print("Digite o modelo do carro: ");
	        meuCarro.setModelo(scanner.nextLine());

	        System.out.print("Digite a marca do carro: ");
	        meuCarro.setMarca(scanner.nextLine());


	        System.out.print("Digite o Ano: ");
	        meuCarro.setAno(scanner.nextInt());


	        System.out.print("Digite a capacidade do tanque: ");
	        meuCarro.setCapacidadeTanque(scanner.nextDouble());
	        
	        System.out.print("Digite o preço da gasolina: ");
		    double precoGasolina = scanner.nextDouble();
		
		
		  System.out.println("Modelo: "+ meuCarro.getModelo());
		  System.out.println("Marca: "+ meuCarro.getMarca());
		  System.out.println("Ano: " + meuCarro.getAno());
		  
		  System.out.println();
		  
		  double total = meuCarro.calcularCapacidade(precoGasolina);
		  System.out.println("Total para encher o tanque: R$ " + total );
		  
		  scanner.nextLine();
		  
		  
		  System.out.println("=====================================");
		  System.out.println("--Conta Bancaria--");
		  
		  
		  ContaBancaria cb = new ContaBancaria("Maria",100);
			
			System.out.println("Digite o nome do titular da conta: ");
			cb.setTitular(scanner.nextLine());
				
			System.out.println("Digite seu saldo: R$");
			cb.setSaldo(scanner.nextDouble());
			
			System.out.println("Digite o valor para depositar");
			double valordepositado = scanner.nextDouble();
			
			System.out.println("Digite o valor que deseja sacar: ");
			double valorsacado = scanner.nextDouble();
			
			System.out.println("Titular da Conta: " + cb.getTitular());
			System.out.println("Saldo em conta: R$" + cb.getSaldo());
			
			System.out.println();
			
			double totaldepositado = cb.depositar(valordepositado);
			
			boolean totalsacado = cb.sacar(valorsacado);
			
			scanner.nextLine();
			
			System.out.println("===================================");
		  
			System.out.println("--Produto--");
			
			Produto produto=new Produto("nome",3.00,5);
			
			System.out.println("Digite o nome do produto: ");
			produto.setNome(scanner.nextLine());
			
			System.out.println("digite o preço do produto: ");
			produto.setPreco(scanner.nextDouble());
			
			System.out.println("digite a quantidade no estoque :");
			produto.setPreco(scanner.nextInt());
			
			System.out.println("nome:"+ produto.getNome());
			System.out.println("preço:"+ produto.getPreco());
			System.out.println("quantidade no estoque:"+ produto.getQuantidadeEstoque ());
	}

}
