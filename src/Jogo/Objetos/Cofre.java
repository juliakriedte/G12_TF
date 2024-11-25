package Jogo.Objetos;

import Jogo.Ferramentas.Chave;
import basicas.Ferramenta;
import basicas.Objeto;

public class Cofre extends Objeto {
    public Cofre() {
		super("Cofre","O cofre está fechado",
			  "O cofre foi aberto. Você achou o diamante!");
	}

	@Override
	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof Chave) {
			this.setAcaoOk(true);
			return true;
		}
		return false;
	}
}
