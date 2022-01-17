package br.com.techdive.jogo.util;

public class Util {
	
	public static int gerarNumeroAleatorio(int max, int min) {
		int valor = (int) (Math.random()*((max + 1) - min)) + min;
		return valor;
	}

}
