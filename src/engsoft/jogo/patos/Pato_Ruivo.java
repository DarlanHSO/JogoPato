package engsoft.jogo.patos;

public class Pato_Ruivo extends Pato implements Padrao_Grasnar{ // Classe concreta, Herança: Pato_Ruivo é uma classe filha de Pato,
                                                                // e implementa a interface Padrao_Grasnar
	public Pato_Ruivo()
	{
		setComportamento(new Voaveis_Asa(), new Pular_Pata()); // Código em tempo de implementação, inicializando o comportamento de voo e **pulo 
	}
	
	public String mostrar() {
		return "Eu sou o Pato Ruivo." ; // Poliformismo: Cada pato diz algo diferente usando o método mostrar 
	}

	public String grasnar() { // Poliformismo: Cada pato faz um som diferente usando o método grasnar 
		// TODO Auto-generated method stub
		return 	"Que-Que.";
	
	}

	public String pular() { // Poliformismo: Cada pato faz um som diferente usando o método pular  
		return "Eu sei pular.";
	}

}
