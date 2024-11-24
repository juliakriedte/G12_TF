package Jogo.Ferramentas;
import especificas.FerramentaDescartavelOculta;

/*
    Chave de Ouro (Jardim) – Abre o cofre onde o Diamante está.
*/

public class Chave extends FerramentaDescartavelOculta {
    // Construtor
    public Chave() 
    {
        super("Chave");
    }

    @Override
    public boolean usar() 
    {
        if (super.usar()) {
            return true;
        }
        return false;
    }

    public void revela()
    {
        this.visivel = true;
    }

}
