import { Padrao_Voaveis } from "./Padrao_Voaveis";
import { Padrao_Pular } from "./Padrao_Pular";

export abstract class Pato {
    protected comportamento_pato_voo: Padrao_Voaveis | null = null;
    protected comportamento_pato_pulo: Padrao_Pular | null = null;

    // Método abstrato
    abstract mostrar(): string;

    // Método comum
    nadar(): string {
        return "Pato Nadando.";
    }

    // Define os comportamentos dinamicamente
    setComportamento(padrao_voo: Padrao_Voaveis, padrao_pulo: Padrao_Pular): void {
        this.comportamento_pato_voo = padrao_voo;
        this.comportamento_pato_pulo = padrao_pulo;
    }

    // Executa os comportamentos atuais
    comportamento_pato(): string {
        const voo = this.comportamento_pato_voo ? this.comportamento_pato_voo.voar() : "Não sabe voar.";
        const pulo = this.comportamento_pato_pulo ? this.comportamento_pato_pulo.pular() : "Não sabe pular.";
        return `${voo} ${pulo}`;
    }
}
