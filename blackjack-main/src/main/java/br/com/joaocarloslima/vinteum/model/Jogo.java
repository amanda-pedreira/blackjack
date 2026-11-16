
package br.com.joaocarloslima.vinteum.model;

public class Jogo {

    private Monte monte = new Monte();
    private Jogador jogador = new Jogador();
    private Mesa mesa = new Mesa();

    public Jogo() {
        monte.embaralhar();

        jogador.receberCarta(monte.virar());
        mesa.receberCarta(monte.virar());

        jogador.receberCarta(monte.virar());
        mesa.receberCarta(monte.virar());
    }

    public void pedirCarta() {
        if (jogador.querCarta()) {
            Carta carta = monte.virar();
            jogador.receberCarta(carta);

            if (jogador.estourou()) {
                jogador.parar();
            }
        }
    }

    public void parar() {
        jogador.parar();

        while (mesa.querCarta()) {
            Carta carta = monte.virar();
            mesa.receberCarta(carta);
        }

        mesa.parar();
    }

    public boolean acabou() {
        if (jogador.estourou()) {
            return true;
        }

        if (jogador.parou() && mesa.parou()) {
            return true;
        }

        return false;
    }

    public String resultado() {
        if (acabou() == false) {
            return "";
        }

        if (jogador.estourou()) {
            return "Você perdeu";
        } else if (mesa.estourou()) {
            return "Você ganhou";
        } else if (jogador.getPontos() > mesa.getPontos()) {
            return "Você ganhou";
        } else if (jogador.getPontos() < mesa.getPontos()) {
            return "Você perdeu";
        } else {
            return "Empate";
        }
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
