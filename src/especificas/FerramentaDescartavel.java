package especificas;
import basicas.Ferramenta;

public abstract class FerramentaDescartavel extends Ferramenta{
    public boolean usado;
    public FerramentaDescartavel(String nome) {
        super(nome);
        this.usado = false;
    }

    @Override
    public boolean usar() {
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
