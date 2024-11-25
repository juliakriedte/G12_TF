package Jogo.Objetos;
import Jogo.Ferramentas.Lanterna;
import basicas.Ferramenta;
import especificas.ObjetoIluminavel;

public class EstanteLivros extends ObjetoIluminavel {
    public EstanteLivros() {
		super("Estante_de_Livros","A estante possui livros, mas não é possivel enxergar pois está muito escuro.",
			 "Você encontrou um livro que parece conter uma pista importante."); 
	}
	
	@Override
	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof Lanterna lanterna) {
			if(!lanterna.isSemEnergia()){
				
			} 
			return false;	
		}
		return false;
	}
}
