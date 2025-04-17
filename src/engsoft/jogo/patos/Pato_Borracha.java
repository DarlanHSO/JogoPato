package engsoft.jogo.patos;

public class Pato_Borracha extends Pato {

	public Pato_Borracha()
	{
		setComportamento(new Nao_Voa(), new Nao_Pula());	
	}
	
	public String mostrar() {
		return "Ola, eu sou de Boarracha.";
	}
	
}
