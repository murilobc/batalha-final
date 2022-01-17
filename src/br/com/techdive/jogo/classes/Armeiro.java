package br.com.techdive.jogo.classes;

import br.com.techdive.jogo.jogador.Inimigo;
import br.com.techdive.jogo.personagem.Arma;

public class Armeiro extends Inimigo {
	private static final int SAUDE_MAXIMA = 100;

	public Armeiro() {
		super(SAUDE_MAXIMA, 10, 15, Arma.ESPADA);
	}

}
