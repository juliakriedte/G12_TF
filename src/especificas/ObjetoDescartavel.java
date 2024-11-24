package especificas;

import Jogo.Ferramentas.Martelo;
import basicas.Ferramenta;
import basicas.Objeto;

public abstract class ObjetoDescartavel extends Objeto {
    public boolean usado;

    public ObjetoDescartavel(String nome, String descricaoAntesAcao, String descricaoDepoisAcao) {
        super(nome, descricaoAntesAcao, descricaoDepoisAcao);
        this.usado = false;
    }

    @Override
    public boolean usar(Ferramenta ferramenta) {
        if (!usado) {
            usado = true;
            return true;
        }
        return false;
    }

    public boolean isUsado() {
        return usado;
    }
}
