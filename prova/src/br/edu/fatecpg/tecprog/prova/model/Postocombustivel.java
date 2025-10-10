package br.edu.fatecpg.tecprog.prova.model;

public class Postocombustivel {
	String[] tiposCombustivel = {"Gasolina", "Etanol", "Diesel"};
    double[] precosLitro = {5.79, 4.39, 4.99};
    int[] litrosDisponiveis = {1000, 800, 1200};


    public void exibirCombustiveis() {
        System.out.println("Combustíveis disponíveis:");
        for (int i = 0; i < tiposCombustivel.length; i++) {
            System.out.println(tiposCombustivel[i] + 
                " - Preço por litro: R$" + precosLitro[i] + 
                " - Estoque: " + litrosDisponiveis[i] + " litros");
        }
    }


    public double calcularValorEstoque() {
        double total = 0;
        for (int i = 0; i < tiposCombustivel.length; i++) {
            total += precosLitro[i] * litrosDisponiveis[i];
        }
        return total;
    }


    public void exibirMaiorEMenorEstoque() {
        int maiorIndex = 0;
        int menorIndex = 0;

        for (int i = 1; i < litrosDisponiveis.length; i++) {
            if (litrosDisponiveis[i] > litrosDisponiveis[maiorIndex]) {
                maiorIndex = i;
            }
            if (litrosDisponiveis[i] < litrosDisponiveis[menorIndex]) {
                menorIndex = i;
            }
        }

        System.out.println("Maior estoque: " + tiposCombustivel[maiorIndex] + " - " + litrosDisponiveis[maiorIndex] + " litros");
        System.out.println("Menor estoque: " + tiposCombustivel[menorIndex] + " - " + litrosDisponiveis[menorIndex] + " litros");
    }


    public void venderCombustivel(String tipo, int litros) {
        for (int i = 0; i < tiposCombustivel.length; i++) {
            if (tiposCombustivel[i].equalsIgnoreCase(tipo)) {
                if (litrosDisponiveis[i] >= litros) {
                    litrosDisponiveis[i] -= litros;
                    System.out.println("Venda realizada: " + litros + " litros de " + tipo);
                } else {
                    System.out.println("Estoque insuficiente para " + tipo);
                }
                return;
            }
        }
        System.out.println("Tipo de combustível não encontrado.");
    }

  
    public void reabastecerCombustivel(String tipo, int litros) {
        for (int i = 0; i < tiposCombustivel.length; i++) {
            if (tiposCombustivel[i].equalsIgnoreCase(tipo)) {
                litrosDisponiveis[i] += litros;
                System.out.println("Reabastecido: " + litros + " litros de " + tipo);
                return;
            }
        }
        System.out.println("Tipo de combustível não encontrado.");
    }
}
