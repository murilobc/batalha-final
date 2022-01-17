package br.com.techdive.jogo.personagem;

public enum Arma {
	ESPADA("Espada", 5), 
	MACHADO("Machado", 5), 
	MARTELO("Martelo", 5), 
	CLAVA("Clava", 5), 
	ARCO("Arco", 5), 
	BESTA("Besta", 5), 
	CAJADO("Cajado", 5), 
	LIVRO_DE_MAGIAS("Livro de Magias", 5),
	ARMADILHA("Armadilha", 2),
	MACHADO_DUPLO("Machado Duplo", 7);

	private String descricao;
	private int ataque;
	
	Arma(String descricao, int ataque) {
		this.descricao = descricao;
		this.ataque = ataque;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public int getAtaque() {
		return this.ataque;
	}
	
}
