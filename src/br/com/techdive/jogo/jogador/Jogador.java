package br.com.techdive.jogo.jogador;

import br.com.techdive.jogo.personagem.Arma;
import br.com.techdive.jogo.personagem.Atacante;
import br.com.techdive.jogo.personagem.Motivacao;
import br.com.techdive.jogo.personagem.Personagem;
import br.com.techdive.jogo.util.Util;

public abstract class Jogador extends Personagem implements Atacante {
	private String nome;
	private String sexo;
	private Motivacao motivacao;
	private Arma arma;
	
	public static final int SAUDE_MAXIMA = 200;
	
	

	public Jogador(int ptAtaque, int ptDefesa, String nome, String sexo) {
		super(SAUDE_MAXIMA, ptAtaque, ptDefesa);
		if (nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
		if ("m".equalsIgnoreCase(sexo) || "masc".equalsIgnoreCase(sexo) || "masculino".equalsIgnoreCase(sexo)) {
			this.sexo = "M";
		} else if ("f".equalsIgnoreCase(sexo) || "fem".equalsIgnoreCase(sexo) || "feminino".equalsIgnoreCase(sexo)) {
			this.sexo = "F";
		} else {
			throw new IllegalArgumentException("Sexo inválido");
		}
	}



	@Override
	public void atacar(Personagem alvo) {
		int rolagem = Util.gerarNumeroAleatorio(20, 1);
		if (rolagem == 1) {
			System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.\n");
		} else {
			StringBuilder mensagem = new StringBuilder();
			int dano = (rolagem + getArma().getAtaque() + getPtAtaque());
			if (rolagem == 20) {
				mensagem.append("Você acertou um ataque crítico!");
			} else {
				dano = dano - alvo.getPtDefesa();
				if (dano < 0) {
					dano = 0;
				}
				
				if (getArma() == Arma.ESPADA || getArma() == Arma.MACHADO ||
						getArma() == Arma.MARTELO || getArma() == Arma.CLAVA) {
					mensagem.append("Você atacou com sua/seu ").append(getArma().getDescricao())
					.append(" e causou ").append(dano).append(" de dano no inimigo!");
					
				} else if (getArma() == Arma.ARCO) {
					mensagem.append("Você atacou com seu ").append(getArma().getDescricao())
					.append(" a flecha atingiu e causou ").append(dano).append(" de dano no inimigo!");
				} else if (getArma() == Arma.BESTA) {
					mensagem.append("Você atacou com sua ").append(getArma().getDescricao())
					.append(" o virote atingiu e causou ").append(dano).append(" de dano no inimigo!");
				} else if (getArma() == Arma.CAJADO) {
					mensagem.append("Você atacou com seu cajado, lançando uma bola de fogo ").append(getArma().getDescricao())
					.append(" e causou ").append(dano).append(" de dano no inimigo!");
				} else if (getArma() == Arma.LIVRO_DE_MAGIAS) {
					mensagem.append("Você atacou absorvendo energia do livro com uma mão e liberando com a outra ").append(getArma().getDescricao())
					.append(" e causou ").append(dano).append(" de dano no inimigo!");
				}
			}
			alvo.setPtVida(alvo.getPtVida() - dano);
			System.out.println(mensagem.toString());
		}
		if (alvo.getPtVida() <= 0) {
			System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
		}
	}
	
	public Motivacao getMotivacao() {
		return motivacao;
	}



	public void setMotivacao(Motivacao motivacao) {
		this.motivacao = motivacao;
	}



	public Arma getArma() {
		return arma;
	}



	public void setArma(Arma arma) {
		this.arma = arma;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
