package Jogo.Objetos;

import Jogo.Ferramentas.Lanterna;
import basicas.Ferramenta;
import basicas.Objeto;
import especificas.FerramentaEnergia;
import especificas.ObjetoDescartavel;

import java.lang.System;

public class Pilha extends ObjetoDescartavel {
	public Pilha() {
		super("Pilha", "a pilha esta no chão",
				"pilha coletada!");
	}

	public boolean usar(Ferramenta ferramenta) {
		if (ferramenta instanceof FerramentaEnergia && !usado) {
			System.out.println(ferramenta.getNome() + " recarregada!");
			((FerramentaEnergia) ferramenta).recarregar();
			super.usar(ferramenta);

			return true;
		}
		return false;
	}

}
