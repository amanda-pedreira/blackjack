
package br.com.joaocarloslima.vinteum.model;

public class Cautelosa implements EstiloDeJogo {

    @Override
    public String getNome() {
        return "Cautelosa";
    }

    @Override
    public boolean querCarta(Mao mao) {
        if (mao.getPontos() < 15) {
            return true;
        } else {
            return false;
        }
    }
}
