import javax.swing.JOptionPane;

//Classe principal do Jogo de Dados
public class JogoDeDadosMain {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador(JOptionPane.showInputDialog("diga seu nome:")); //Instância da classe Jogador 
		Jogador jogador2 = new Jogador(JOptionPane.showInputDialog("diga seu nome:")); //Instância da classe Jogador
		
		JogoDeDados jogoDeDados = new JogoDeDados(jogador1, jogador2, 6); //Instância da classe JogoDeDados que pega o jogador1, jogador2 e o numero de lados do dado
		
		jogoDeDados.jogar(); //Método jogar chamado da classe JogoDeDados
		jogoDeDados.jogar();
		jogoDeDados.jogar();
		jogoDeDados.jogar();
		jogoDeDados.jogar();
		
		
		System.out.println( "O " + jogador1.getNome() + " fez " + jogador1.getPontuacao() + " ponto(s)!"); //Mostra a pontuação final do jogador 1
		System.out.println( "O " + jogador2.getNome() + " fez " + jogador2.getPontuacao() + " ponto(s)!"); //Mostra a pontuação final do jogador 2
		
		if (jogador1.getPontuacao() > jogador2.getPontuacao()) {//Vê qual o jogador teve a maior pontuação e declara o vencedor, se a pontução entre os jogadores for igual será, empate
			System.out.println("O " + jogador1.getNome() + " ganhou!");}
		else if (jogador1.getPontuacao() < jogador2.getPontuacao()){
			System.out.println("O " + jogador2.getNome() + " ganhou!");}
		else{
			System.out.println("Os dois jogadores empataram!");
		}
	}
}
