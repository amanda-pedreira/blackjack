
package br.com.joaocarloslima.vinteum.model;

public class Jogador extends Participante {

    @Override
    public boolean querCarta() {
        if (parou() == false && estourou() == false) {
            return true;
        } else {
            return false;
        }
    }
}
