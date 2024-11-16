package Jogo.Ferramentas;
import basicas.Ferramenta;

/* 
    Martelo (Quarto) – Quebra objetos, como potes e estátuas.
*/

public class Martelo extends Ferramenta{
    public Martelo(){
        super("Martelo");
    }

    @Override
    public boolean usar() {
        return true;
    }    
}
