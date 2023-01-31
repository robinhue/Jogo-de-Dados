import java.util.Random; //Importa a classe Random para aleatorizar a rolagem de dados

//Classe usada para representar um jogador em um jogo de dados.

public class Dado {
	//Atributos
	private int numeroDeLados; //Representa o número de lados do dado
	private Random random; // Instância da classe java.util.Random
	
	public Dado(int numeroDeLados) {
		//Construtor
		this.numeroDeLados = numeroDeLados; // Recebe o número de lados como parâmetro
		this.random = new Random(); //Cria uma nova intância a partir da classe Random
	}
	
	public int rolar() {
		//Método
		return this.random.nextInt(this.numeroDeLados) + 1; //Retorna um inteiro aleatório de 1 a "numeroDeLados", è adicionado 1 para garantir que o resultado fique entre o valor desejado[1, "numeroDeLados'].
	}
}