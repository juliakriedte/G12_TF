package especificas;
import basicas.Ferramenta;

public abstract class FerramentaOculta extends Ferramenta{
    public FerramentaOculta(String nome) {
        super(nome);
    }

    public abstract boolean isVisivel();
}
