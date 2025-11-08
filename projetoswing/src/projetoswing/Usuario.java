package projetoswing;

import java.awt.Color;

class Usuario {
    private String tema = "Claro";
    private boolean notificacoesHabilitadas = true;
    private int volume = 50;

   
    public String getTema() { return tema; }
    public boolean isNotificacoesHabilitadas() { return notificacoesHabilitadas; }
    public int getVolume() { return volume; }

   
    public void setTema(String tema) { this.tema = tema; }
    public void setNotificacoesHabilitadas(boolean notificacoesHabilitadas) { 
        this.notificacoesHabilitadas = notificacoesHabilitadas; 
    }
    public void setVolume(int volume) { this.volume = volume; }

  
    @Override
    public String toString() {
        String statusNotif = notificacoesHabilitadas ? "Habilitadas" : "Desabilitadas";
        return "Preferências Salvas:\n" +
               "Tema: " + tema + "\n" +
               "Notificações: " + statusNotif + "\n" +
               "Volume: " + volume;
    }
}