package Jogo;
//teste1
//import Jogo.Salas.Cozinha;

import java.io.IOException;
import Jogo.Salas.HallEntrada;
import Jogo.Salas.Quarto;
import Jogo.Salas.SalaDeEstar;
import basicas.Engine;
import basicas.Sala;

public class Jogo extends Engine {
    public Jogo() {
        super();
    }

    @Override
    public void criaCenario() {
        // Define as salas que compõem o mapa
        Sala hall = new HallEntrada(this);
        Sala sala = new SalaDeEstar(this);
        Sala quarto = new Quarto(this);
       // Sala cozinha = new Cozinha(this);

        // Encadeia as salas através das portas
        hall.getPortas().put(sala.getNome(), sala);
        sala.getPortas().put(hall.getNome(), hall);
        sala.getPortas().put(quarto.getNome(), quarto);
       // sala.getPortas().put(cozinha.getNome(), cozinha);
        quarto.getPortas().put(sala.getNome(), sala);
        ///cozinha.getPortas().put(sala.getNome(), sala);

        // Define a sala inicial
        this.setSalaCorrente(hall);
    }

    public static void main(String args[]) throws IOException{
        System.out.println("=====================");
        System.out.println("   BEM-VINDO AO O MISTÉRIO DO DIAMENTE PERDIDO");
        System.out.println("=====================");
        
        System.out.println("Pressione qualquer tecla para continuar...");

        // Aguarda qualquer tecla ser pressionada
        int tecla = System.in.read();

        // Verifica se qualquer tecla foi pressionada
        if (tecla != -1) { // -1 significa "sem entrada"
            System.out.println("Você pressionou uma tecla e entrou no bloco 'if'!");
            Jogo jd = new Jogo();
        jd.joga();
        }

    }
}
