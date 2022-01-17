package br.com.techdive.jogo.classes;

import br.com.techdive.jogo.jogador.Inimigo;
import br.com.techdive.jogo.personagem.Arma;

public class Lider extends Inimigo {
	private static final int SAUDE_MAXIMA = 200;

	public Lider() {
		super(SAUDE_MAXIMA, 15, 15, Arma.MACHADO_DUPLO);
	}
	

}
