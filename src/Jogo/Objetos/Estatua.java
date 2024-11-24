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

	public boolean usar(Ferramenta ferramenta, Ferramenta c) {
		if (ferramenta instanceof Lanterna lanterna) {
			if(!lanterna.isSemEnergia()){
				if(c instanceof Chave){
					this.setAcaoOk(true);
					this.visivel = true;	
					((Chave) c).revela();
					return true;							
				}
				
			} 
			return false;	
		}
		return false;
	}
}
