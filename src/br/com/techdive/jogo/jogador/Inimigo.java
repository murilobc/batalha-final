package br.com.techdive.jogo.jogador;

import br.com.techdive.jogo.personagem.Arma;
import br.com.techdive.jogo.personagem.Atacante;
import br.com.techdive.jogo.personagem.Personagem;
import br.com.techdive.jogo.util.Util;

public abstract class Inimigo extends Personagem implements Atacante {
	private Arma arma;

	public Inimigo(int ptVida, int ptAtaque, int ptDefesa, Arma arma) {
		super(ptVida, ptAtaque, ptDefesa);
		this.arma = arma;
	}

	@Override
	public void atacar(Personagem alvo) {
		int rolagem = Util.gerarNumeroAleatorio(20, 1);
		if (rolagem == 1) {
			System.out.println("O inimigo errou o ataque! Você não sofreu dano.");
		} else {
			StringBuilder mensagem = new StringBuilder();
			int dano = (rolagem + arma.getAtaque() + getPtAtaque());
			if (rolagem == 20) {
				mensagem.append("O inimigo acertou um ataque crítico! ");
			} else {
				dano = dano - alvo.getPtDefesa();
				if (dano < 0) {
					dano = 0;
				}
				mensagem.append("O inimigo atacou! ");
			}
			alvo.setPtVida(alvo.getPtVida() - dano);
			mensagem.append("Você sofreu %d de dano e agora possui %d pontos de vida.\n");
			System.out.printf(mensagem.toString(), dano, alvo.getPtVida());
		}
	}

}
