package Jogo.Objetos;
import Jogo.Ferramentas.Lanterna;
import basicas.Ferramenta;
import basicas.Objeto;

public class EstanteLivros extends Objeto{
    public EstanteLivros() {
		super("Estante_de_Livros","A estante possui livros.",
			  "O livro foi encontrado. "); // Colocar uma mensagem aqui
	}

	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof Lanterna) {
			this.setAcaoOk(true);
			return true;
		}
		return false;
	}
}
