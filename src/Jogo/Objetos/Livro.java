package Jogo.Objetos;
import Jogo.Ferramentas.Lupa;
import basicas.Ferramenta;
import especificas.ObjetoOculto;

public class Livro extends ObjetoOculto {
    public Livro() {
		super("Livro", "", "O título do livro é: ''"); // Escrever algo
		this.setAcaoOk(true);
		visivel = false;
	}

	@Override
	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof Lupa) {
			this.setAcaoOk(true);
			return true;
		}
		return false;
	}
}
