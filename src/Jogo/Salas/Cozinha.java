package Jogo.Salas;

import Jogo.Ferramentas.Lapis;
import Jogo.Objetos.PoteDeAcucar;
import basicas.Engine;
import basicas.Ferramenta;
import basicas.Objeto;
import basicas.Sala;

// falta incrementar metodos pra entrar ir das salas(interagir com as portas)

public class Cozinha extends Sala {
    public Cozinha(Engine engine) {
        super("Cozinha", engine);
        Objeto poteMisterioso = new PoteDeAcucar();
        Ferramenta lapis = new Lapis();
        this.getObjetos().put(poteMisterioso.getNome(), poteMisterioso);
        this.getFerramentas().put(lapis.getNome(), lapis);
    }

    // @Override
    // public boolean usa(String nomeFerramenta)
    // {
    // // implementar
    // return false;
    // }
}
