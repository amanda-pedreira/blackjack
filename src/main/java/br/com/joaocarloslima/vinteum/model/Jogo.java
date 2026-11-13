
package br.com.joaocarloslima.vinteum.model;

public class Jogo {

    private Monte monte = new Monte();
    private Jogador jogador = new Jogador();
    private Mesa mesa = new Mesa();

    public Jogo() {
    }

    public void pedirCarta() {
    }

    public void parar() {
    }

    public boolean acabou() {
        return false;
    }

    public String resultado() {
        return null;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Monte getMonte() {
        return monte;
    }
}
