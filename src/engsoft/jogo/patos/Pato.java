package engsoft.jogo.patos;

public abstract class Pato { // Classe abstrata
    
    // Corrigido: agora são dois atributos distintos e com nomes consistentes
    protected Padrao_Voaveis comportamento_pato_voo; // Composição, Pato tem um comportamento de voo
    protected Padrao_Pular comportamento_pato_pulo; // ** Composição, Pato tem um comportamento de pulo 

    // Método abstrato, implementado nas subclasses
    abstract String mostrar();

    // Método comum a todos os patos
    public String nadar() {
        return "Pato Nadando.";
    }

    // Define os comportamentos dinamicamente
    public void setComportamento(Padrao_Voaveis padrao_voo, Padrao_Pular padrao_pulo) { // Delegação, comportamento de voo e de *pulo delegado para a interface Padrao_Voaveis
        this.comportamento_pato_voo = padrao_voo;
        this.comportamento_pato_pulo = padrao_pulo;
    }

    // Executa os comportamentos atuais e retorna as ações
    public String comportamento_pato() {
        String voo = (comportamento_pato_voo != null) ? comportamento_pato_voo.voar() : "Não sabe voar.";
        String pulo = (comportamento_pato_pulo != null) ? comportamento_pato_pulo.pular() : "Não sabe pular.";
        return voo + " " + pulo;
    }
}
