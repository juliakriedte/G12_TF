package Jogo.Objetos;
import Jogo.Ferramentas.Lupa;
import basicas.Ferramenta;
import especificas.ObjetoOculto;

public class Livro extends ObjetoOculto {
	private static boolean visivel;
    public Livro() {
		super("Livro", "O livro precisa ser analisado.", "O título do livro é: 'Onde a terra floresce, o mistério aguarda'");
		visivel = false;
	}

	public static void revela(){
        visivel = true;
    }

	@Override
    public boolean isVisivel(){
        return visivel;
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
