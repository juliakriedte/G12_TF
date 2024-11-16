package Jogo.Objetos;
import Jogo.Ferramentas.Lanterna;
import basicas.Ferramenta;
import basicas.Objeto;

/* 
	Espelho (Biblioteca) – Revela uma mensagem ao ser iluminado com a lanterna, indicando uma pista falsa para a cozinha.
*/

public class Espelho extends Objeto{
    public Espelho() {
		super("Espelho","O espelho reflete a imagem.",
			  "O espelho projeta uma mensagem: ''!"); // Colocar uma mensagem aqui
	}

	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof Lanterna) {
			this.setAcaoOk(true);
			return true;	
		}
		
		return false;
	}
}
