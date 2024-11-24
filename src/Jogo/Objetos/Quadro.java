package Jogo.Objetos;

import Jogo.Ferramentas.Lupa;
import Jogo.Salas.Porao;
import basicas.Ferramenta;
import basicas.Objeto;
import basicas.Sala;

public class Quadro extends Objeto {
	public Quadro() {
		super("Quadro","O quadro exibe uma pintura do Barão, emoldurada com detalhes dourados.", 
              "Ao observar mais de perto, o quadro parece esconder o acesso a uma nova sala.");
	}

	public boolean usar(Ferramenta ferramenta, Sala s) {
		if (ferramenta instanceof Lupa) {
			if(s instanceof Porao){
				this.setAcaoOk(true);
				((Porao) s).revela();
				return true;				
			}
		}
		return false;
	}

	@Override
	public boolean usar(Ferramenta ferramenta) {
		throw new UnsupportedOperationException("Parâmetros insuficientes");
	}
}