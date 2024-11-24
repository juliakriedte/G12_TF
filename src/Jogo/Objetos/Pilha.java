package Jogo.Objetos;

import Jogo.Ferramentas.Lanterna;
import basicas.Ferramenta;
import basicas.Objeto;

public class Pilha extends Objeto
{
    public Pilha() 
	{
		super("Pilha","a pilha esta no chão",
			  "pilha coletada!");
	}

	public boolean usar(Ferramenta ferramenta) 
	{
		if (ferramenta instanceof Lanterna) {
			this.setAcaoOk(true);
            
			return true;
		}
		return false;
	}
	
}
