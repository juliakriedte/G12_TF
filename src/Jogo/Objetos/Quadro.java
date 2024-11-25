package Jogo.Objetos;

import Jogo.Ferramentas.Lupa;
import Jogo.Salas.Porao;
import basicas.Ferramenta;
import basicas.Objeto;

public class Quadro extends Objeto {
	public Quadro() {
		super("Quadro","O quadro exibe uma pintura do Barão, emoldurada com detalhes dourados.", 
              "Ao observar mais de perto, o quadro parece esconder o acesso a uma nova sala.");
	}

	@Override
	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof Lupa) {
			this.setAcaoOk(true);
			Porao.revela();
			return true;
		}
		return false;
	}
}