package Jogo.Salas;

import Jogo.Ferramentas.Chave;
import Jogo.Objetos.Estatua;
import basicas.Engine;
import basicas.Objeto;
import basicas.Sala;
import especificas.FerramentaDescartavelOculta;

public class Jardim extends Sala {
    public Jardim(Engine engine) {
        super("Jardim", engine);
        FerramentaDescartavelOculta chaveDeOuro = new Chave();
        this.getFerramentas().put(chaveDeOuro.getNome(), chaveDeOuro);
        Objeto estatua = new Estatua();
        this.getObjetos().put(estatua.getNome(), estatua);

    }

    // @Override
    // public boolean usa(String nomeFerramenta)
    // { // implementar
    // /*if (!this.getObjetos().containsKey(nomeFerramenta)) {
    // return false;
    // }
    // chaveDeOuro.revela();
    // boolean usou = chaveDeOuro.usar();
    // if (chaveDeOuro instanceof Chave && usou) {
    // this.getEngine().indicaFimDeJogo();
    // }
    // return usou;*/
    // return false;
    // }
}
