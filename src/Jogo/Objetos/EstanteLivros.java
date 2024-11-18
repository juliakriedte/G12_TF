package Jogo.Objetos;
import Jogo.Ferramentas.Lanterna;
import basicas.Ferramenta;
import especificas.ObjetoIluminavel;

public class EstanteLivros extends ObjetoIluminavel {
    public EstanteLivros() {
		super("Estante_de_Livros","A estante possui livros.",
			  "O livro foi encontrado. "); // Colocar uma mensagem aqui
	}
	
	@Override
	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof Lanterna) {
			if(!((Lanterna) ferramenta).isSemEnergia()){
				this.setAcaoOk(true);
				this.visivel = true;	
				Livro.revela();
				return true;		
			} 
			return false;	
		}
		return false;
	}
}
