package Jogo.Salas;

import Jogo.Objetos.PoteDeAcucar;
import basicas.Engine;
import basicas.Objeto;
import basicas.Sala;

// falta incrementar metodos pra entrar ir das salas(interagir com as portas)

public class Cozinha extends Sala {
    public Cozinha(Engine engine) {
        super("Cozinha", engine);
        Objeto poteMisterioso = new PoteDeAcucar();
        this.getObjetos().put(poteMisterioso.getNome(), poteMisterioso);
    }

    // @Override
    // public boolean usa(String nomeFerramenta)
    // {
    // // implementar
    // return false;
    // }
}
