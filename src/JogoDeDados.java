//Classe usada para representar um criar o jogo de dados instanciando da classe Jogador e da classe Dado
public class JogoDeDados {
	//Atributos
	private Jogador jogador1; //Objeto da classe Jogador
	private Jogador jogador2; //Objeto da classe Jogador
	private Dado dado; //Objeto da classe Dado
	
	public JogoDeDados(Jogador jogador1, Jogador jogador2, int numeroDeLadosDoDado) {
		//Construtor
		this.jogador1 = jogador1; //Argumento de jogador1
		this.jogador2 = jogador2; //Argumento de jogador2
		this.dado = new Dado(numeroDeLadosDoDado); //Argumento que passa o numero de lados
	}
	
	public void jogar() {
		// Método responsável por simular a jogada dos dados
		int rolagemJogador1 = dado.rolar();
		int rolagemJogador2 = dado.rolar();
		
		System.out.println(jogador1.getNome() + " rolou " + rolagemJogador1); //Print para mostrar o resultado da rolagem do jogador1
		System.out.println(jogador2.getNome() + " rolou " + rolagemJogador2); //Print para mostrar o resultado da rolagem do jogador2
		
		if (rolagemJogador1 > rolagemJogador2) {//Vê qual o jogador tirou a rolagem maior e adiciona um ponto na pontuação do jogador, se a rolagem entre os jogadores for igual, será empate
			jogador1.adicionarPontos(1);
			System.out.println(jogador1.getNome() + " ganhou!");
		} else if (rolagemJogador2 > rolagemJogador1) {
			jogador2.adicionarPontos(1);
			System.out.println(jogador2.getNome() + " ganhou!");
		} else {
			System.out.println("Empate!");
		}
	}
}

