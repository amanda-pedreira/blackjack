
package br.com.joaocarloslima.vinteum.model;

import java.util.ArrayList;
import java.util.List;

public class Mao {

    private List<Carta> cartas = new ArrayList<>();

    public void adicionar(Carta carta) {
        cartas.add(carta);
    }

    public int getPontos() {
        int pontos = 0;
        int ases = 0;

        for (int i = 0; i < cartas.size(); i++) {
            Carta carta = cartas.get(i);

            pontos = pontos + carta.getValor();

            if (carta.getNumero() == 1) {
                ases++;
            }
        }

        for (int i = 0; i < ases; i++) {
            if (pontos + 10 <= 21) {
                pontos = pontos + 10;
            }
        }

        return pontos;
    }

    public boolean estourou() {
        if (getPontos() > 21) {
            return true;
        } else {
            return false;
        }
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
