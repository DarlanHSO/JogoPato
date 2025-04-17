package engsoft.jogo.patos;

public class Pular_Alto implements Padrao_Pular{
	
	private double altura;
	
	public Pular_Alto()
	{
		altura = 3;	
	}
	
	public String pular() {
		return "Pulando como um coelho. Altura: " + getAltura();		
	}

	public double getAltura() {
		return altura;
	}	
}