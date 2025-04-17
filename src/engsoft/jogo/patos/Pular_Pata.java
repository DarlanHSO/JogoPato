package engsoft.jogo.patos;

public class Pular_Pata implements Padrao_Pular {

	private double altura;

	public Pular_Pata() {
		altura = 2;
	}

	public String pular() {
		return "Pulando como um passaro que pula. Altura: "
				+ getAltura();
	}

	public double getAltura() {
		return altura;
	}

}