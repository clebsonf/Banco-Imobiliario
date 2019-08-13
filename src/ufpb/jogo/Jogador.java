package ufpb.jogo;

import java.util.LinkedList;

import ufpb.exceptions.LimiteExcedidoException;
import ufpb.exceptions.ValorInvalidoException;
import ufpb.lougradouros.Terreno;
import ufpb.lougradouros.Titulo;

/**
 * Representing the player
 * @author Joana
  */
public class Jogador {
	private String nome;
	private String cor;
	private int posicao;
	private Conta conta;
	private LinkedList<Titulo> titulos;

	/**
	 * Constructor from class Jogador, enables initialization of name and color attributes. 
	 * @author Joana 
	 * @param String nome - player's name
	 * @param String cor - player's pawn color
	 * @param int posicao - the player's position
	  */
	public Jogador(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
		this.titulos = new LinkedList<Titulo>();
		this.conta = new Conta();
	}
<<<<<<< HEAD
	
	public void receber(int valor) {
		try {
			this.conta.deposita(valor);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
		}
	}
	
	public void pagar(Jogador j, int valor) {
		try {
			this.conta.debita(valor);
			j.conta.deposita(valor);
		} catch (ValorInvalidoException e) {
			
		} catch (LimiteExcedidoException e) {
			if(this.titulos.size() == 0) {
				System.out.println("Falencia");	
			}else {
				this.titulos.getLast().venderAoBanco(j);;
				pagar(j,valor);
			}
		}
	}
=======

>>>>>>> f4a56500a3215b22a817e55016611274b1797675
	/**
	 * Method that enables the access to name attribute. 
	 * @author Joana
	 * @return String - name attribute value
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Method that enables the access to color attribute
	 * @author Joana
	 * @return String - color attribute value
	 */
	public String getCor() {
		return this.cor;
	}
	
	/**
	 * Method that enables the access to positon attribute
	 * @author Joana
	 * @return int - position attribute value
	 */
	public int getPosicao() {
		return this.posicao;
	}

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	/**
	 * Method that enables the access to account balance attribute
	 * 
	 * @author Joana
	 * @return int - account balance attribute value
	 */
=======
>>>>>>> parent of faaa86d... add javadoc
=======
>>>>>>> parent of faaa86d... add javadoc
	public int getSaldo() {
		return this.conta.getSaldo();
	}
	
	/**
<<<<<<< HEAD
<<<<<<< HEAD
	 * Method for the player to buy the land 
=======
	/**
	 * Metodo para jogador comprar terreno
>>>>>>> f4a56500a3215b22a817e55016611274b1797675
=======
	 * Metodo para jogador comprar terreno
	 * 
>>>>>>> parent of faaa86d... add javadoc
=======
	 * Metodo para jogador comprar terreno
	 * 
>>>>>>> parent of faaa86d... add javadoc
	 * @author joana
	 * @param valor
	 * @param t
	 * @throws ValorInvalidoException, LimiteExcedidoException
	 */
	
	public void comprarTerreno(int valor, Terreno t) {
		try {
			this.conta.debita(valor);
			System.out.println("Compra efetuada com sucesso!");
		} catch (ValorInvalidoException e) {
			System.err.println(e.getMessage());
		} catch (LimiteExcedidoException e) {
			System.err.println(e.getMessage() + ", saldo R$ " + this.conta.getSaldo());
		}
		this.titulos.add(t);
	}
	
	/**
	 * @author joana
	 * @return String - the player's name and pawn color
	 */
	@Override
	public String toString() {
		return this.nome + "(" + this.cor + ")";
	}

	/**
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	 * Method to make the move
	 * 
	 * @author joana
	 * @param Dado d - the dice
	 * @param Tabuleiro t - the board
=======
	 * Metodo para efetuar a Jogada
	 *@author joana
	 * @param d Dado utilizado no jogo
	 * @param t Tabuleiro utilizado no jogo
>>>>>>> f4a56500a3215b22a817e55016611274b1797675
=======
	 * Metodo para efetuar a Jogada
	 * 
	 * @author joana
	 * @param d Dado utilizado no jogo
	 * @param t Tabuleiro utilizado no jogo
>>>>>>> parent of faaa86d... add javadoc
=======
	 * Metodo para efetuar a Jogada
	 * 
	 * @author joana
	 * @param d Dado utilizado no jogo
	 * @param t Tabuleiro utilizado no jogo
>>>>>>> parent of faaa86d... add javadoc
	 * 
	 */
	// JOGADOR USA DADO, PORTANTO, DADO É UM PARAMETRO DO METODO JOGADA
	public void jogada(Dado d, Tabuleiro t) {
		int dado1 = d.lancaDado();
		int dado2 = d.lancaDado();
		this.posicao += dado1 + dado2;
		if (this.posicao > 39) {
			this.posicao -= 39;
		}
		System.out.println(this.toString() + "tirou " + dado1 + "," + dado2 + " e o peão avançou "+ t.getPosicoeDoTabuleiro(this.getPosicao()));
	}
	/**
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	 * Method to indicate the player'status
	 * @author Clebson
	 * @param Tabuleiro t - the board
	 */
=======
	 * Metodo para indicar o status do jogador
	 * @author clebson
	 * @param t Tabuleiro
	 * 
	 * */

>>>>>>> f4a56500a3215b22a817e55016611274b1797675
=======
	 * Metodo para indicar o status do jogador
	 * 
	 * @author clebson
	 * @param t Tabuleiro
	 * 
	 */

>>>>>>> parent of faaa86d... add javadoc
=======
	 * Metodo para indicar o status do jogador
	 * 
	 * @author clebson
	 * @param t Tabuleiro
	 * 
	 */

>>>>>>> parent of faaa86d... add javadoc
	public void status(Tabuleiro t) {
		System.out.println("O status de " +this.toString()+" é o seguinte:");
		System.out.println("Situado na posição "+t.getPosicoeDoTabuleiro(this.getPosicao()));
		System.out.println("Titulos:");
<<<<<<< HEAD
		if(this.titulos.size() > 0) {
			for (Titulo c : titulos) {
				System.out.println(c.mostrarTitulo());
			}
		} else {
<<<<<<< HEAD
<<<<<<< HEAD
			System.out.println("N�o possui titulos");
=======
		for(Titulo c: titulos) {
			System.out.println(c);
>>>>>>> f4a56500a3215b22a817e55016611274b1797675
=======
			System.out.println("N�o possui titulos");
>>>>>>> parent of faaa86d... add javadoc
=======
			System.out.println("N�o possui titulos");
>>>>>>> parent of faaa86d... add javadoc
		}
	}

	public void sair() {
		//SAIR DA APLICAÇÃO
		System.exit(0);
	}

}