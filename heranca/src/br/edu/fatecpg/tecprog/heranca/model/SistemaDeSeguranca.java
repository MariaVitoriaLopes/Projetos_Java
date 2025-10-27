package br.edu.fatecpg.tecprog.heranca.model;



public class SistemaDeSeguranca implements IAutenticavel {

    private  String USUARIO_CORRETO = "admin";
    private String SENHA_CORRETA = "1234";
    private boolean autenticado = false;

    @Override
    public boolean login(String usuario, String senha) {
        if (usuario.equals(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
            autenticado = true;
            System.out.println(" Login realizado com sucesso!");
            return true;
        } else {
            System.out.println(" Usuário ou senha incorretos. Tente novamente.");
            return false;
        }
    }

    @Override
    public void logout() {
        if (autenticado) {
            autenticado = false;
            System.out.println(" Logout realizado com sucesso!");
        } else {
            System.out.println(" Nenhum usuário está logado no momento.");
        }
    }

    public boolean isAutenticado() {
        return autenticado;
    }
}


	

