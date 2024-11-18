package Jogo.Salas;

import Jogo.Objetos.PoteDeAcucar;
//import Jogo.Objetos.PoteDeArroz;
import basicas.Engine;
import basicas.Objeto;
import basicas.Sala;

public class Biblioteca extends Sala {
    public Biblioteca(Engine engine) {
        super("Biblioteca", engine);



        //Objeto poteAcucar = new PoteDeAcucar();
        //this.getObjetos().put(poteAcucar.getNome(), poteAcucar);
        //Objeto poteArroz = new PoteDeArroz();
       // this.getObjetos().put(poteArroz.getNome(), poteArroz);
    }

    @Override
    public boolean usa(String objeto) {
        if (!this.getObjetos().containsKey(objeto)) {
            return false;
        }
        Objeto pote = this.getObjetos().get(objeto);
        boolean usou = pote.usar(this.getEngine().getMochila());
        if (pote instanceof PoteDeAcucar && usou) {
            this.getEngine().indicaFimDeJogo();
        }
        return usou;
    }
}