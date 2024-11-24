package Jogo.Salas;

import Jogo.Ferramentas.Martelo;
import Jogo.Objetos.Quadro;
import basicas.Engine;
import basicas.Ferramenta;
import basicas.Objeto;
import basicas.Sala;

public class Quarto extends Sala {

    public Quarto(Engine engine) {
        super("Quarto", engine);
        Ferramenta martelo = new Martelo();
        this.getFerramentas().put(martelo.getNome(), martelo);
        Objeto pintura = new Quadro();
        this.getObjetos().put(pintura.getNome(), pintura);
    }

    // @Override
    // public boolean usa(String nomeFerramenta) {
    // // implementar
    // return false;
    // }

}
