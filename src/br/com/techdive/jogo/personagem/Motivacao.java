package br.com.techdive.jogo.personagem;

public enum Motivacao {
	VINGANCA("Vingança"),
	GLORIA("Glória");

	private String descricao;
	
	Motivacao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

}
