package Jogo.Salas;

import Jogo.Ferramentas.Lanterna;
import Jogo.Objetos.Espelho;
import Jogo.Objetos.EstanteLivros;
import Jogo.Objetos.PoteDeAcucar;
import basicas.Engine;
import basicas.Ferramenta;
import basicas.Objeto;
import basicas.Sala;

// falta incrementar metodos pra entrar ir das salas(interagir com as portas)

public class Biblioteca extends Sala 
{

    public Biblioteca(Engine engine) 
    {
        super("Biblioteca", engine);
        Ferramenta lanterna = new Lanterna();
        this.getFerramentas().put(lanterna.getNome(), lanterna);
        Objeto espelho = new Espelho();
        this.getObjetos().put(espelho.getNome(), espelho);
        Objeto estanteLivros = new EstanteLivros();
        this.getObjetos().put(estanteLivros.getNome(), estanteLivros);
    }

    @Override
    public boolean usa(String objeto) 
    {
        // ajustar dps
        if (!this.getObjetos().containsKey(objeto)) {
            return false;
        }
        Objeto pote = this.getObjetos().get(objeto);
        boolean usou = pote.usar(this.getEngine().getMochila());
        if (pote instanceof PoteDeAcucar) {
            if (((PoteDeAcucar) pote).isUsado())
            this.getEngine().indicaFimDeJogo();
        }
        return usou;
    }

}