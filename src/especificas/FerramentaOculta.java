package especificas;
import basicas.Ferramenta;

public abstract class FerramentaOculta extends Ferramenta{
    public boolean visivel;
    public FerramentaOculta(String nome) {
        super(nome);
    }
    public void tornaVisivel(){
        this.visivel = true;
    }
}
