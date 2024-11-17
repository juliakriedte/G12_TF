package Jogo.Ferramentas;
import especificas.FerramentaDescartavel;

/*
    Chave de Ouro (Jardim) – Abre o cofre onde o Diamante está.
*/

public class Chave extends FerramentaDescartavel {
    // Construtor
    public Chave() {
        super("Chave de Ouro");
    }

    @Override
    public boolean usar() {
        if (super.usar()) {
            return true;
        }
        return false;
    }
}
