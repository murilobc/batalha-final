package br.com.techdive.jogo.jogador;

import br.com.techdive.jogo.personagem.Arma;
import br.com.techdive.jogo.personagem.Atacante;
import br.com.techdive.jogo.personagem.Personagem;
import br.com.techdive.jogo.util.Util;

public class Armadilha implements Atacante {
	private Arma arma;
	private int ptAtaque;
	
	public Armadilha() {
		this.ptAtaque = 5;
		this.arma = Arma.ARMADILHA;
	}

	@Override
	public void atacar(Personagem alvo) {
		int rolagem = Util.gerarNumeroAleatorio(10, 1);
		if (rolagem == 1) {
			System.out.println("O ataque da armadilha pegou de raspão e você não sofreu dano.");
		} else {
			int dano = (rolagem + arma.getAtaque() + this.ptAtaque) - alvo.getPtDefesa();
			if (dano < 0) {
				dano = 0;
			}
			alvo.setPtVida(alvo.getPtVida() - dano);
			System.out.printf("Você sofreu %d de dano e agora possui %d pontos de vida.\n", dano, alvo.getPtVida());
		}
	}
	
}
