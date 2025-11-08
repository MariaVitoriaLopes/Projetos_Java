package projetoswing;


class Cliente {
    private String nome;
    private int idade;
    private String sexo;

    public Cliente(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    
    @Override
    public String toString() {
        return "<html>Resumo do Cadastro:<br>" +
               "Nome:" + nome + "<br>" +
               "Idade: " + idade + "<br>" +
               "Sexo: " + sexo + "</html>";
    }
}