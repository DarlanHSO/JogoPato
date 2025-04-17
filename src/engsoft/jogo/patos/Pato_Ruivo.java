package engsoft.jogo.patos;

public class Pato_Ruivo extends Pato implements Padrao_Grasnar{

	public Pato_Ruivo()
	{
		setComportamento(new Voaveis_Asa(), new Pular_Pata());		
	}
	
	public String mostrar() {
		return "Eu sou o Pato Ruivo." ;
	}

	public String grasnar() {
		// TODO Auto-generated method stub
		return 	"Que-Que.";
	
	}

	public String pular() {
		return "Eu sei pular.";
	}

}
