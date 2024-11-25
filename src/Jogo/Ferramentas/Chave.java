package Jogo.Ferramentas;
import especificas.FerramentaDescartavelOculta;

/*
    Chave de Ouro (Jardim) – Abre o cofre onde o Diamante está.
*/

public class Chave extends FerramentaDescartavelOculta {
    private static boolean visivel;
    public Chave() 
    {
        super("Chave");
        visivel = false;
    }

    @Override
    public boolean usar() 
    {
        if (super.usar()) {
            return true;
        }
        return false;
    }

    public static void revela(){
        visivel = true;
    }

    @Override
    public boolean isVisivel(){
        return visivel;
    }

}
