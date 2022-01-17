package br.com.techdive.jogo.util;

import java.util.Scanner;

import br.com.techdive.jogo.classes.Arqueiro;
import br.com.techdive.jogo.classes.Guerreiro;
import br.com.techdive.jogo.classes.Mago;
import br.com.techdive.jogo.classes.Paladino;
import br.com.techdive.jogo.jogador.Jogador;
import br.com.techdive.jogo.personagem.Arma;
import br.com.techdive.jogo.personagem.Motivacao;

public class Input {
	Scanner input  = new Scanner(System.in);
	
	public String solicitarNome() {
		System.out.println("Nome para o personagem?");
		return input.nextLine();
	}
	
	public String solicitarSexo() {
		System.out.println("Sexo para o personagem (F/M)?");
		return input.nextLine();
	}

	public int solicitarClasse() {
		System.out.println("Selecione a classe o personagem:");
		System.out.println("1 - Guerreiro");
		System.out.println("2 - Paladino");
		System.out.println("3 - Arqueiro");
		System.out.println("4 - Mago");
		
		return Integer.valueOf(input.nextLine());
	}

	public Arma solicitarArma(int classe) {
		System.out.println("Seleciona a arma desejada:");
		Arma arma = null;
		int opcao;
		switch (classe) {
			case 1: {
				System.out.println("1 - Espada");
				System.out.println("2 - Machado");
				opcao = Integer.valueOf(input.nextLine());
				if (opcao == 1) {
					arma = Arma.ESPADA;
				} else if (opcao == 2) {
					arma = Arma.MACHADO;
				}
				break;
			}
			case 2: {
				System.out.println("1 - Martelo");
				System.out.println("2 - Clava");
				opcao = Integer.valueOf(input.nextLine());
				if (opcao == 1) {
					arma = Arma.MARTELO;
				} else if (opcao == 2) {
					arma = Arma.MACHADO;
				}
				break;
			}
			case 3: {
				System.out.println("1 - Arco");
				System.out.println("2 - Besta");
				opcao = Integer.valueOf(input.nextLine());
				if (opcao == 1) {
					arma = Arma.ARCO;
				} else if (opcao == 2) {
					arma = Arma.BESTA;
				}
				break;
			}
			case 4: {
				System.out.println("1 - Livro de Magias");
				System.out.println("2 - Cajado");
				opcao = Integer.valueOf(input.nextLine());
				if (opcao == 1) {
					arma = Arma.LIVRO_DE_MAGIAS;
				} else if (opcao == 2) {
					arma = Arma.CAJADO;
				}
				break;
			}
			default: {
				throw new IllegalArgumentException("Opção de arma inválida");
			}
		}
		return arma;

	}

	public Jogador criarJogador(String nome, String sexo, int classe, Arma arma) {
		switch (classe) {
			case 1: {
				return new Guerreiro(nome, sexo, arma);
			}
			case 2: {
				return new Paladino(nome, sexo, arma);
			}
			case 3: {
				return new Arqueiro(nome, sexo, arma);
			}
			case 4: {
				return new Mago(nome, sexo, arma);
			}
			default:
				return null;
			}
	}

	public Motivacao selecionarMotivacao() {
		System.out.println("Qual a sua motivação para esta jornada?");
		System.out.println("1 - Vingança");
		System.out.println("2 - Glória");
		
		Motivacao motivacao = null;
		
		int opcao = Integer.valueOf(input.nextLine());
		if (opcao == 1) {
			motivacao = Motivacao.VINGANCA;
		} else if (opcao == 2) {
			motivacao = Motivacao.GLORIA;
		} else {
			throw new IllegalArgumentException("Opção de motivação inválida");
		}
		
		return motivacao;
	}

	public String prosseguir() {
		System.out.println("Você deseja desistir? (S/N)");
		String opcao = input.nextLine();
		if (!"S".equalsIgnoreCase(opcao) && !"N".equalsIgnoreCase(opcao)) {
			throw new IllegalArgumentException("Opção inválida");
		}
		return opcao;
	}

	public int atravessarPorta() {
		System.out.println("Como você deseja atravessar a porta?");
		System.out.println("1 - Andando Cuidadosamente");
		System.out.println("2 - Correndo");
		System.out.println("3 - Saltando");
		
		int opcao = Integer.valueOf(input.nextLine());
		
		if (opcao < 1 || opcao > 3) {
			throw new IllegalArgumentException("Opção invalida");
		}
		
		return opcao;
	}

	public String selecionarFugir() {
		System.out.println("Você deseja tentar fugir? (S/N)");
		
		String opcao = input.nextLine();
		
		if (!"S".equalsIgnoreCase(opcao) && !"N".equalsIgnoreCase(opcao)) {
			throw new IllegalArgumentException("Opção inválida");
		}
		
		return opcao;
	}

	public String selecionarLoot() {
		System.out.println("Você deseja pegar as armaduras novas? (S/N)");
		
		String opcao = input.nextLine();
		
		if (!"S".equalsIgnoreCase(opcao) && !"N".equalsIgnoreCase(opcao)) {
			throw new IllegalArgumentException("Opção inválida");
		}
		
		return opcao;
	}

	public String selecionarBeber() {
		System.out.println("Você deseja beber? (S/N)");
		
		String opcao = input.nextLine();
		
		if (!"S".equalsIgnoreCase(opcao) && !"N".equalsIgnoreCase(opcao)) {
			throw new IllegalArgumentException("Opção inválida");
		}
		
		return opcao;
	}

	public String selecionarAtacar() {
		System.out.println("Você deseja atacar? (S/N)");
		
		String opcao = input.nextLine();
		
		if (!"S".equalsIgnoreCase(opcao) && !"N".equalsIgnoreCase(opcao)) {
			throw new IllegalArgumentException("Opção inválida");
		}
		
		return opcao;
	}

}
