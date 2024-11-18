package Jogo.Ferramentas;

import basicas.Ferramenta;

public class Lupa extends Ferramenta{
    public Lupa(){
        super("Lupa");
    }

    @Override
    public boolean usar() {
        return true;
    }    
}
