package ufpb.opcoes;

import ufpb.jogo.JogoFacade;

public class Sair implements Opcao {

	@Override
	public boolean fazerOP(JogoFacade jogo) {
		if(jogo.getNumeroDeJogadores() > 2) {
			jogo.removeJogador();
		}else {
			jogo.removeJogador();
			System.out.println(jogo.JogadorAtual()+" é o vencedor!");
			System.exit(0);
		}
		return false;
	}

}