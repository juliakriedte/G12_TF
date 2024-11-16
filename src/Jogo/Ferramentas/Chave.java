package Jogo.Ferramentas;
import especificas.FerramentaDescartavel;

/*
    Chave de Ouro (Jardim) – Abre o cofre onde o Diamante está.
*/

public class Chave extends FerramentaDescartavel{
    public Chave(){
        super("Chave");
    }

    @Override
    public boolean usar() {
        return true;
    }    
}
