package engsoft.jogo.patos;

public class Nao_Pula implements Padrao_Pular { // Classe concreta que implementa a interface Padrao_Pular

	
	public Nao_Pula() // Código em tempo de implementação, inicializando o objeto "nao_pula"
	{
			
	}
	
	public String pular() {
		return "Esse pato nao Pula. Altura: " + getAltura();
	}

	public double getAltura() {
		return 0;
	}

}
