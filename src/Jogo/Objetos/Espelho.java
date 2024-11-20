package Jogo.Objetos;
import especificas.ObjetoIluminavel;

/* 
	Espelho (Biblioteca) – Revela uma mensagem ao ser iluminado com a lanterna, indicando uma pista falsa para a cozinha.
*/

public class Espelho extends ObjetoIluminavel{
    public Espelho() {
		super("Espelho","O espelho reflete a imagem.",
			  "O espelho projeta uma mensagem: ''!"); // Colocar uma mensagem aqui
	}
}
