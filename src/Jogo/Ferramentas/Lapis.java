package Jogo.Ferramentas;
import especificas.FerramentaOculta;

public class Lapis extends FerramentaOculta{
    public Lapis() {
        super("Lapis");
    }

    @Override
    public boolean usar() {
        return false;
    } 
}
