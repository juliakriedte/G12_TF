package Jogo.Objetos;
import basicas.Ferramenta;
import especificas.ObjetoOculto;

public class Livro extends ObjetoOculto {
    public Livro() {
		super("Livro", "O título do livro é: ''"); // Escrever algo
		this.setAcaoOk(true);
	}

	@Override
	public boolean usar(Ferramenta ferramenta) {
		this.setAcaoOk(true);
		return true;
	}
}
