package engsoft.jogo.patos;

public class Pular_Baixo implements Padrao_Pular{
	
	private double altura;
	
	public Pular_Baixo()
	{
		altura = 1;	
	}
	
    @Override
	public String pular() {
		return "Pulando como uma pulga. Altura: " + getAltura();		
	}

    @Override
	public double getAltura() {
		return altura;
	}	
}