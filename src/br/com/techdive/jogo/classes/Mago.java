package br.com.techdive.jogo.classes;

import br.com.techdive.jogo.jogador.Jogador;
import br.com.techdive.jogo.personagem.Arma;

public class Mago extends Jogador {

	public Mago(String nome, String sexo, Arma arma) {
		super(19, 11, nome, sexo);
		setArma(arma);
	}
	
	@Override
	public void setArma(Arma arma) {
		if (!arma.equals(Arma.CAJADO) && !arma.equals(Arma.LIVRO_DE_MAGIAS)) {
			throw new IllegalArgumentException("Arma inválida para Mago");
		}
		super.setArma(arma);
	}

}
