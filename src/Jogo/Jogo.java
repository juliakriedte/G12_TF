package Jogo;
import Jogo.Salas.Biblioteca;
import Jogo.Salas.Cozinha;
import Jogo.Salas.Jardim;
import Jogo.Salas.Porao;
import Jogo.Salas.Quarto;
import Jogo.Salas.SalaDeEstar;
import basicas.Engine;
import basicas.Sala;

public class Jogo extends Engine 
{

    public Jogo() 
    {
        super();
    }

    @Override
    public void criaCenario() 
    {
        // Define as salas que compõem o mapa
        Sala jardim = new Jardim(this);
        Sala biblioteca = new Biblioteca(this);
        Sala porao = new Porao(this);
        Sala salaDeEstar = new SalaDeEstar(this);
        Sala quarto = new Quarto(this);
        Sala cozinha = new Cozinha(this);

        // Encadeia as salas através das portas
        salaDeEstar.getPortas().put(jardim.getNome(), jardim);
        salaDeEstar.getPortas().put(cozinha.getNome(), cozinha);
        salaDeEstar.getPortas().put(biblioteca.getNome(), biblioteca);

        jardim.getPortas().put(salaDeEstar.getNome(), salaDeEstar);
        jardim.getPortas().put(cozinha.getNome(), cozinha);

        quarto.getPortas().put(biblioteca.getNome(), biblioteca);
        quarto.getPortas().put(porao.getNome(), porao);

        biblioteca.getPortas().put(quarto.getNome(), quarto);
        biblioteca.getPortas().put(salaDeEstar.getNome(), salaDeEstar);

        cozinha.getPortas().put(salaDeEstar.getNome(), salaDeEstar);
        cozinha.getPortas().put(jardim.getNome(), jardim);

        porao.getPortas().put(quarto.getNome(), quarto);

        // Define a sala inicial
        this.setSalaCorrente(salaDeEstar);
    }

    public static void main(String args[])
    {
        Jogo jd = new Jogo();
        jd.joga();
    }

}