package Jogo.Ferramentas;
import especificas.FerramentaDescartavel;

/*
    Chave de Ouro (Jardim) – Abre o cofre onde o Diamante está.
*/

public class Chave extends FerramentaDescartavel {
    public boolean visivel;
    public Chave() {
        super("Chave de Ouro");
        visivel = false;
    }

    public void revela(){
        this.visivel = true;
    }
    
    public boolean isVisivel(){
        return visivel;
    }

    @Override
    public boolean usar() {
        return super.usar();
    }
}
