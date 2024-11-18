package Jogo.Objetos;

import Jogo.Ferramentas.Chave;
import basicas.Ferramenta;
import basicas.Objeto;

public class Quadro extends Objeto {
	public Quadro() {
		super("armario","O quadro exibe uma pintura do Barão",
			  "O quadro esconde a entrada de uma sala secreta.");
	}

	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof Chave) {
			this.setAcaoOk(true);
			return true;
		}
		return false;
	}
}