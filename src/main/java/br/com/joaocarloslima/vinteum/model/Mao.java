
package br.com.joaocarloslima.vinteum.model;

import java.util.ArrayList;
import java.util.List;

public class Mao {

    private List<Carta> cartas = new ArrayList<>();

    public void adicionar(Carta carta) {
    }

    public int getPontos() {
        return 0;
    }

    public boolean estourou() {
        return false;
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
