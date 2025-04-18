import { Pato } from "./Pato";
import { Voar_Raso } from "./Voar_Raso";
import { Pular_Baixo } from "./Pular_Baixo";

// Pato ruivo voa com asas e pula baixo
export class Pato_Ruivo extends Pato {
    constructor() {
        super();
        this.setComportamento(new Voar_Raso(), new Pular_Baixo());
    }

    mostrar(): string {
        return "Eu sou um Pato Ruivo!";
    }
}
