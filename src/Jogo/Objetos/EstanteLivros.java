package Jogo.Objetos;
import Jogo.Ferramentas.Lanterna;
import basicas.Ferramenta;
import basicas.Objeto;
import especificas.ObjetoIluminavel;

public class EstanteLivros extends ObjetoIluminavel {
    public EstanteLivros() {
		super("Estante_de_Livros","A estante possui livros, mas não é possivel enxergar pois está muito escuro.",
			 "Você encontrou um livro que parece conter uma pista importante."); 
	}
	
	public boolean usar(Ferramenta ferramenta, Objeto l) {
		if (ferramenta instanceof Lanterna lanterna) {
			if(!lanterna.isSemEnergia()){
				if(l instanceof Livro){
					this.setAcaoOk(true);
					this.visivel = true;	
					((Livro) l).revela();
					return true;					
				}
			} 
			return false;	
		}
		return false;
	}
}
