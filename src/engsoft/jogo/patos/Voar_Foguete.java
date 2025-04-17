package engsoft.jogo.patos;

public class Voar_Foguete implements Padrao_Voaveis{ // Classe concreta que implementa a interface Padrao_voaveis
	
	private double velocidade;
	
	public Voar_Foguete()
	{
		velocidade = 1000;	
	}
	
	public String voar() {
		return "Voando como um foguete. Velocidade: " + getVelocidade();		
	}

	public double getVelocidade() {
		return velocidade;
	}	
}
