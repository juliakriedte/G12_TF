package Jogo.Ferramentas;
import especificas.FerramentaEnergia;

/* 
    Lanterna (Biblioteca) – Revela mensagens e objetos ocultos em locais escuros.
*/

public class Lanterna extends FerramentaEnergia{
    public Lanterna() {
        super("Lanterna");
    }

    @Override
    public boolean usar() {
        return true;
    } 
}
