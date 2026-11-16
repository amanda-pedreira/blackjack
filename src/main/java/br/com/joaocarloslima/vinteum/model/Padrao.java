
package br.com.joaocarloslima.vinteum.model;

public class Padrao implements EstiloDeJogo {

    @Override
    public String getNome() {
        return "Padrão";
    }

    @Override
    public boolean querCarta(Mao mao) {
        if (mao.getPontos() < 17) {
            return true;
        } else {
            return false;
        }
    }
}
