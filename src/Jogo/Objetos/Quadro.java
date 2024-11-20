package Jogo.Objetos;

import Jogo.Ferramentas.Lupa;
import Jogo.Salas.Porao;
import basicas.Ferramenta;
import basicas.Objeto;
import basicas.Sala;

public class Quadro extends Objeto {
	public Quadro() {
		super("armario","O quadro exibe uma pintura do Barão",
			  "O quadro esconde a entrada de uma sala secreta.");
	}

	public boolean usar(Ferramenta ferramenta, Sala s) {
		if (ferramenta instanceof Lupa) {
			if(s instanceof Porao){
				this.setAcaoOk(true);
				((Porao) s).revelar();
				return true;				
			}
		}
		return false;
	}
}