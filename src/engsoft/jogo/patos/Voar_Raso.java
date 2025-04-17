package engsoft.jogo.patos;

public class Voar_Raso implements Padrao_Voaveis { // Classe concreta que implementa a interface Padrao_Voaveis
	
	private double velocidade;
	
	public Voar_Raso() {
		velocidade = 100;
	}

	@Override
	public String voar() {
		return "Voando perto do chao. Velocidade: "
				+ getVelocidade();
	}

	@Override
	public double getVelocidade() {
		return velocidade;
	}

}
