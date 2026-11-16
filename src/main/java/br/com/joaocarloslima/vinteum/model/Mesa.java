
package br.com.joaocarloslima.vinteum.model;

public class Mesa extends Participante {

    private EstiloDeJogo estilo = new Padrao();

    @Override
    public boolean querCarta() {
        if (parou() == false && estourou() == false) {
            return estilo.querCarta(getMao());
        } else {
            return false;
        }
    }

    public void setEstilo(EstiloDeJogo estilo) {
        this.estilo = estilo;
    }

    public EstiloDeJogo getEstilo() {
        return estilo;
    }
}
