package br.com.techdive.jogo.classes;

import br.com.techdive.jogo.jogador.Jogador;
import br.com.techdive.jogo.personagem.Arma;

public class Paladino extends Jogador {

	public Paladino(String nome, String sexo, Arma arma) {
		super(13, 18, nome, sexo);
		setArma(arma);
	}
	
	@Override
	public void setArma(Arma arma) {
		if (!arma.equals(Arma.MARTELO) && !arma.equals(Arma.CLAVA)) {
			throw new IllegalArgumentException("Arma inválida para Paladino");
		}
		super.setArma(arma);
	}

}
