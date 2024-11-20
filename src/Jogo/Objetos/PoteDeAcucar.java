package Jogo.Objetos;
import Jogo.Ferramentas.Martelo;
import basicas.Ferramenta;
import basicas.Objeto;

public class PoteDeAcucar extends Objeto {
	public PoteDeAcucar() {
		super("Pote_de_Acucar","O pote de açúcar esta fechado",
			  "O pote de açúcar esta quebrado. Tem uma nova ferramenta dentro!");
	}

	@Override
	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof Martelo) {
			this.setAcaoOk(true);
			return true;
		}
		return false;
	}
}