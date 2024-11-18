package Jogo.Salas;

import Jogo.Objetos.Quadro;
import basicas.Engine;
import basicas.Objeto;
import basicas.Sala;

/* 
    Sala de Estar – Ponto de entrada com acesso para a Cozinha e Jardim.
*/

public class SalaDeEstar extends Sala {
    public SalaDeEstar(Engine engine) {
        super("Sala_de_Estar", engine);
        Objeto armario = new Quadro();
        this.getObjetos().put(armario.getNome(), armario);
    }

    @Override
    public boolean usa(String nomeFerramenta) {
        if (!this.getObjetos().containsKey(nomeFerramenta)) {
            return false;
        }
        Objeto armario = this.getObjetos().get(nomeFerramenta);
        return armario.usar(this.getEngine().getMochila());
    }
}
