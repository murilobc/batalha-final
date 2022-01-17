package br.com.techdive.jogo.personagem;

public enum Motivacao {
	VINGANCA("Vingan�a"),
	GLORIA("Gl�ria");

	private String descricao;
	
	Motivacao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

}
