package br.com.techdive.jogo.classes;

import br.com.techdive.jogo.jogador.Inimigo;
import br.com.techdive.jogo.personagem.Arma;

public class Alquimista extends Inimigo {
	private static final int SAUDE_MAXIMA = 100;

	public Alquimista() {
		super(SAUDE_MAXIMA, 15, 10, Arma.CAJADO);
	}

}
