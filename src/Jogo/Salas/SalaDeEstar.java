package Jogo.Salas;

import Jogo.Ferramentas.Lupa;
import Jogo.Objetos.Pilha;
import basicas.Engine;
import basicas.Ferramenta;
import basicas.Objeto;
import basicas.Sala;

/* 
    Sala de Estar – Ponto de entrada com acesso para a Cozinha e Jardim.
*/

public class SalaDeEstar extends Sala 
{
    public SalaDeEstar(Engine engine) 
    {
        super("Sala_de_Estar", engine);
        Objeto pilha = new Pilha();
        this.getObjetos().put(pilha.getNome(), pilha);
        Ferramenta lupa = new Lupa();
        this.getFerramentas().put(lupa.getNome(), lupa);
    }

    @Override
    public boolean usa(String nomeFerramenta) 
    {
        if (!this.getObjetos().containsKey(nomeFerramenta)) {
            return false;
        }
        Objeto pilha = this.getObjetos().get(nomeFerramenta);
        return pilha.usar(this.getEngine().getMochila());
    }
}
