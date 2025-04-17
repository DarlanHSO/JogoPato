package engsoft.jogo.patos;

public class Main {

	public static void main(String[] args) {
		Pato pt = new Pato_Ruivo(); // Código em tempo de execução, instanciando um objeto concreto		
		
		System.out.println(pt.mostrar()); 
		System.out.println(pt.nadar());
		System.out.println(pt.comportamento_pato());
		
		pt.setComportamento(new Voar_Foguete(), new Pular_Alto()); // Código em tempo de execução, mudando o comportamento de voo e *pulo 
		
		System.out.println(pt.comportamento_pato());
		
		pt.setComportamento(new Voar_Raso(), new Pular_Baixo()); // Código em tempo de execução, mudando o comportamento de voo e *pulo novamente
		
		System.out.println(pt.comportamento_pato());
		
		
	}

}
