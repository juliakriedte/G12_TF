package Jogo.Salas;

import basicas.Engine;
import basicas.Sala;
import basicas.Ferramenta;
import basicas.Objeto;
import Jogo.Ferramentas.Chave;
import Jogo.Objetos.Bilhete;



public class Quarto extends Sala {
    public Quarto(Engine engine) {
        super("Quarto", engine);
        Ferramenta chave = new Chave();
        this.getFerramentas().put(chave.getNome(), chave);
        //Objeto bilhete = new Bilhete();
        this.getObjetos().put(bilhete.getNome(), bilhete);
    }

    @Override
    public boolean usa(String nomeFerramenta) {
        return false;
    }
}