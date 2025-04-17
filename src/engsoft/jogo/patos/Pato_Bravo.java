package engsoft.jogo.patos;

public class Pato_Bravo extends Pato implements  Padrao_Grasnar{ // Classe concreta, Herança: Pato_Bravo é uma classe filha de Pato,
                                                                // e implementa a interface Padrao_Grasnar

	public Pato_Bravo()	
	{
		setComportamento(new Voaveis_Asa(), new Pular_Pata()); // Código em tempo de implementação, inicializando o comportamento de voo e *pulo (atividade 2)
	}
	
	public String mostrar() { // Poliformismo: Cada pato diz algo diferente usando o método mostrar 		
		return "Eu sou o Pato Bravo.";
	}

	public String grasnar() { // Poliformismo: Cada pato faz um som diferente usando o método grasnar 
		return "Que-Que. Grrrrrrrrr.";
	}

	public String pular() { // Poliformismo: Cada pato faz um som diferente usando o método pular
		return "Eu sei pular.";
	}

}
