package engsoft.jogo.patos;

public class Nao_Pula implements Padrao_Pular {

	
	public Nao_Pula()
	{
			
	}
	
	public String pular() {
		return "Esse pato nao Pula. Altura: " + getAltura();
	}

	public double getAltura() {
		return 0;
	}

}
