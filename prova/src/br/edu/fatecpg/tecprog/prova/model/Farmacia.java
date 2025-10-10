package br.edu.fatecpg.tecprog.prova.model;

public class Farmacia {
	
	    String[] nomesMedicamentos;
	    int[] diasParaVencimento;
	    double[] precos;

	    public Farmacia(String[] nomes, int[] dias, double[] precos) {
	        this.nomesMedicamentos = nomes;
	        this.diasParaVencimento = dias;
	        this.precos = precos;
	    }

	 
	    public void mostrarMedicamentos() {
	        System.out.println("Medicamentos na farmácia:");
	        for (int i = 0; i < nomesMedicamentos.length; i++) {
	            System.out.println(nomesMedicamentos[i] + " - " + precos[i] + " R$ - " + diasParaVencimento[i] + " dias para vencer");
	        }
	    }

	   
	    public double calcularMediaDias() {
	        int soma = 0;
	        for (int dias : diasParaVencimento) {
	            soma += dias;
	        }
	        return (double) soma / diasParaVencimento.length;
	    }

	   
	    public void mostrarProximosDeVencer() {
	        System.out.println("Medicamentos próximos do vencimento:");
	        for (int i = 0; i < diasParaVencimento.length; i++) {
	            if (diasParaVencimento[i] < 5) {
	                System.out.println(nomesMedicamentos[i] + " - " + diasParaVencimento[i] + " dias");
	            }
	        }
	    }

	    
	    public void aplicarDesconto() {
	        for (int i = 0; i < diasParaVencimento.length; i++) {
	            if (diasParaVencimento[i] < 5) {
	                precos[i] *= 0.5;
	            }
	        }
	    }


	    public void venderMedicamento(String nome) {
	        int index = -1;
	        for (int i = 0; i < nomesMedicamentos.length; i++) {
	            if (nomesMedicamentos[i].equalsIgnoreCase(nome)) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	         
	            nomesMedicamentos = removerElemento(nomesMedicamentos, index);
	            diasParaVencimento = removerElemento(diasParaVencimento, index);
	            precos = removerElemento(precos, index);
	            System.out.println("Medicamento \"" + nome + "\" vendido com sucesso.");
	        } else {
	            System.out.println("Medicamento \"" + nome + "\" não encontrado.");
	        }
	    }

	 
	    private String[] removerElemento(String[] array, int index) {
	        String[] novo = new String[array.length - 1];
	        for (int i = 0, j = 0; i < array.length; i++) {
	            if (i != index) {
	                novo[j++] = array[i];
	            }
	        }
	        return novo;
	    }

	    private int[] removerElemento(int[] array, int index) {
	        int[] novo = new int[array.length - 1];
	        for (int i = 0, j = 0; i < array.length; i++) {
	            if (i != index) {
	                novo[j++] = array[i];
	            }
	        }
	        return novo;
	    }

	    private double[] removerElemento(double[] array, int index) {
	        double[] novo = new double[array.length - 1];
	        for (int i = 0, j = 0; i < array.length; i++) {
	            if (i != index) {
	                novo[j++] = array[i];
	            }
	        }
	        return novo;
	    }
	}


