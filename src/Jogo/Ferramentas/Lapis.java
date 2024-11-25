package Jogo.Ferramentas;
import especificas.FerramentaOculta;

public class Lapis extends FerramentaOculta{
    public static boolean visivel;
    public Lapis() {
        super("Lapis");
        visivel = false;
    }

    public static void revela(){
        visivel = true;
    }

    @Override
    public boolean isVisivel(){
        return visivel;
    }

    @Override
    public boolean usar() {
        return true;
    }
}
