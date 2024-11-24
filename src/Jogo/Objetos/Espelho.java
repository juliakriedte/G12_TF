package Jogo.Objetos;
import especificas.ObjetoIluminavel;

/* 
	Espelho (Biblioteca) – Revela uma mensagem ao ser iluminado com a lanterna, indicando uma pista falsa para a cozinha.
*/

public class Espelho extends ObjetoIluminavel{
    public Espelho() {
		super("Espelho", "O espelho reflete a imagem, mas parece esconder algo mais.", 
              "O espelho projeta a mensagem: 'O próximo passo está onde a fome encontra saciedade.'"); 
	}
}
