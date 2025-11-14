package br.edu.fatecpg.listas.model;

public class Empresa {
	private String nome;
	
	private Cliente[] clientes;
	private int numClientes;
	private int  maximoClientes=5;
	
	private Funcionario[] funcionarios;
	private int numFuncionarios;
	private int maximoFuncionarios=10;
	
	public Empresa(String nome) {
		this.nome=nome;
		this.clientes=new Cliente[maximoClientes];
		this.funcionarios=new Funcionario[maximoFuncionarios];
		this.numClientes=0;
		this.numFuncionarios=0;
	}
	public String adicionarCliente(String nome, String email) {
        if (numClientes < maximoClientes) {
        	clientes[numClientes] = new Cliente(nome, email);          
        	numClientes++;
            return "Cliente '" + nome + "' adicionado com sucesso.";
        } else {
            return "Erro: Limite de " + maximoClientes + " clientes atingido.";
        }
    }

   
    public String exibirClientes() {
        if (numClientes == 0) {
            return "Nenhum cliente cadastrado.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("--- Lista de Clientes (" + numClientes + "/" + maximoClientes + ") ---\n");
        for (int i = 0; i < numClientes; i++) {
            sb.append(clientes[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public String adicionarFuncionario(String nome, String cargo, double salario) {
        if (numFuncionarios <maximoFuncionarios) {
           
            funcionarios[numFuncionarios] = new Funcionario(nome, cargo, salario);
            numFuncionarios++;
            return "Funcionário '" + nome + "' adicionado com sucesso.";
        } else {
            return "Erro: Limite de " + maximoFuncionarios + " funcionários atingido.";
        }
    }

   
    public String exibirFuncionarios() {
        if (numFuncionarios == 0) {
            return "Nenhum funcionário cadastrado.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("--- Lista de Funcionários (" + numFuncionarios + "/" + maximoFuncionarios + ") ---\n");
        for (int i = 0; i < numFuncionarios; i++) {
            sb.append(funcionarios[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public double calcularFolhaSalarial() {
        double total = 0;
        for (int i = 0; i < numFuncionarios; i++) {
            total += funcionarios[i].getSalario();
        }
        return total;
    }

   
    public double calcularMediaSalarial() {
        if (numFuncionarios == 0) {
            return 0;
        }

      
        Calculadora calc = new Calculadora();
        double total = 0;

        
        for (int i = 0; i < numFuncionarios; i++) {
            total = calc.soma(total, funcionarios[i].getSalario());
        }

      
        return calc.divisao(total, numFuncionarios);
        
    
    }

   
    public String exibirMediaSalarial() {
        double media = calcularMediaSalarial();
        return "Média Salarial: R$ " + String.format("%.2f", media);
    }
}
