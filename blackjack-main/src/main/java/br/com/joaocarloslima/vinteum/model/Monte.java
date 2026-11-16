
package br.com.joaocarloslima.vinteum.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {

    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        Naipe[] naipes = Naipe.values();

        for (int i = 0; i < naipes.length; i++) {
            for (int j = 1; j <= 13; j++) {
                Carta carta = new Carta(j, naipes[i]);
                cartas.add(carta);
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta virar() {
        Carta carta = cartas.get(0);
        cartas.remove(0);
        return carta;
    }

    public int getQuantidade() {
        return cartas.size();
    }
}
