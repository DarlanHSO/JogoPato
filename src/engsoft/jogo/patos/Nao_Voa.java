package engsoft.jogo.patos;

public class Nao_Voa implements Padrao_Voaveis { // Classe concreta que implementa a interface Padrao_Voaveis

	
	public Nao_Voa() // Código em tempo de implementação, inicializando o objeto
	{
			
	}
	
	public String voar() {
		return "Esse pato não Voa. Velocidade: " + getVelocidade();
	}

	public double getVelocidade() {
		return 0;
	}

}
