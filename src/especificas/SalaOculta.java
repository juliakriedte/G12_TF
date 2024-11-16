package especificas;

import basicas.Engine;
import basicas.Sala;

public abstract class SalaOculta extends Sala{
    public boolean visivel;
    public SalaOculta(String nome, Engine engine) {
        super(nome, engine);
        this.visivel = false;
    }

    public void revela(){
        this.visivel = true;
    }
}