package Jogo.Objetos;
import basicas.Ferramenta;
import basicas.Objeto;

public class Livro extends Objeto {
    public static boolean visivel;
    public Livro() {
		super("Livro", "", "O título do livro é: ''"); // Escrever algo
		this.setAcaoOk(true);
		visivel = false;
	}

	public boolean usar(Ferramenta ferramenta) {
		this.setAcaoOk(true);
		return true;
	}

	public static void revela(){
        visivel = true;
    }
}
