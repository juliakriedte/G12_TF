package Jogo.Objetos;

import Jogo.Ferramentas.Chave;
import Jogo.Ferramentas.Lanterna;
import basicas.Ferramenta;
import especificas.ObjetoIluminavel;

public class Estatua extends ObjetoIluminavel {
    public Estatua() {
		super("Estatua","A estatua exibe a imagem do Barão.",
			  "A estatua possui um compartimento secreto com uma nova ferramenta.");
	}

	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof Lanterna lanterna) {
			if(!lanterna.isSemEnergia()){
				this.setAcaoOk(true);
				this.visivel = true;	
				Chave.revela();
				return true;		
				
			} 
			return false;	
		}
		return false;
	}
}
