package especificas;

import basicas.Ferramenta;

public class FerramentaDescartavelOculta extends Ferramenta
{
    public boolean usado;
    public boolean visivel;

    public FerramentaDescartavelOculta(String nome) 
    {
        super(nome);
        this.usado = false;
        this.visivel = false;
    }

    @Override
    public boolean usar() 
    {
        if (!usado) {
            usado = true;
            return true;
        }
        return false;
    }

    public boolean isUsado() { return usado; }
    public boolean isVisivel(){ return visivel; }

    public void revela()
    {
        this.visivel = true;
    }
}
