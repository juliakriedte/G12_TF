package especificas;

import basicas.Engine;
import basicas.Sala;

public abstract class SalaSecreta extends Sala{
    public SalaSecreta(String nome, Engine engine) {
        super(nome, engine);
    }

    @Override
    public boolean usa(String nomeFerramenta) {
        throw new UnsupportedOperationException("Unimplemented method 'usa'");
    }
    
}