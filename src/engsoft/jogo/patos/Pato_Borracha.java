package engsoft.jogo.patos;

public class Pato_Borracha extends Pato { // Classe concreta, Herança: Pato_Borracha é uma classe filha de Pato

	public Pato_Borracha()
	{
		setComportamento(new Nao_Voa(), new Nao_Pula());  // Código em tempo de implementação, inicializando o comportamento de voo e *não pulo	(atividade 2)
	}
	
	public String mostrar() {
		return "Ola, eu sou de Boarracha."; // Poliformismo: Cada pato diz algo diferente usando o método mostrar 
	}
	
}
