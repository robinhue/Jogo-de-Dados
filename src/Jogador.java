//Classe usada para representar um jogador em um jogo de dados.

public class Jogador {
	//Atributos
	private String nome; //Atributo que representa o nome ao jogador
	private int pontuacao; //Atributo que representa a pontuação do jogador
	
	public Jogador(String nome) {
		//Construtor
		this.nome = nome; //Recebe uma String como argumento
		this.pontuacao = 0; //Pontuação é inicializada com zero
	}
	
	public int getPontuacao() {
		//Método público que retorna a pontuação do jogador
		return this.pontuacao;
	}
	
	public String getNome() {
		//Método público que retorna o nome do jogador
		return this.nome;
	}
	
	public void adicionarPontos(int pontos) {
		//Método usado para adicionar pontos à pontuação do jogador
		this.pontuacao += pontos;
	}
	
}
