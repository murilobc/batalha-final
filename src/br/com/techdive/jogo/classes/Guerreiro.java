package br.com.techdive.jogo.classes;

import br.com.techdive.jogo.jogador.Jogador;
import br.com.techdive.jogo.personagem.Arma;

public class Guerreiro extends Jogador {

	public Guerreiro(String nome, String sexo, Arma arma) {
		super(15, 15, nome, sexo);
		setArma(arma);
	}
	
	@Override
	public void setArma(Arma arma) {
		if (!arma.equals(Arma.ESPADA) && !arma.equals(Arma.MACHADO)) {
			throw new IllegalArgumentException("Arma inválida para Guerreiro");
		}
		super.setArma(arma);
	}

}
