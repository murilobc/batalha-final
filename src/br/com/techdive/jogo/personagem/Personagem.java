package br.com.techdive.jogo.personagem;

public class Personagem {
	private int ptVida;
	private int ptAtaque;
	private int ptDefesa;
	
	
	public Personagem(int ptVida, int ptAtaque, int ptDefesa) {
		super();
		this.ptVida = ptVida;
		this.ptAtaque = ptAtaque;
		this.ptDefesa = ptDefesa;
	}


	public int getPtVida() {
		return ptVida;
	}


	public void setPtVida(int ptVida) {
		this.ptVida = ptVida;
	}


	public int getPtAtaque() {
		return ptAtaque;
	}


	public void setPtAtaque(int ptAtaque) {
		this.ptAtaque = ptAtaque;
	}


	public int getPtDefesa() {
		return ptDefesa;
	}


	public void setPtDefesa(int ptDefesa) {
		this.ptDefesa = ptDefesa;
	}
	
	

}
