package Jogo.Salas;

import Jogo.Objetos.Cofre;
import basicas.Engine;
import basicas.Objeto;
import especificas.SalaOculta;

// falta incrementar metodos pra entrar ir das salas(interagir com as portas)

public class Porao extends SalaOculta {
    public Porao(Engine engine) 
    {
        super("Porao", engine);
        Objeto cofrePequeno = new Cofre();
        this.getObjetos().put(cofrePequeno.getNome(), cofrePequeno);
    }

    @Override
    public boolean usa(String nomeFerramenta) {
        return false;
    }
}

