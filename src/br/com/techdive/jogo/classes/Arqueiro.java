package br.com.techdive.jogo.classes;

import br.com.techdive.jogo.jogador.Jogador;
import br.com.techdive.jogo.personagem.Arma;

public class Arqueiro extends Jogador {

	public Arqueiro(String nome, String sexo, Arma arma) {
		super(18, 13, nome, sexo);
		setArma(arma);
	}
	
	@Override
	public void setArma(Arma arma) {
		if (!arma.equals(Arma.ARCO) && !arma.equals(Arma.BESTA)) {
			throw new IllegalArgumentException("Arma inválida para Arqueiro");
		}
		super.setArma(arma);
	}

}
