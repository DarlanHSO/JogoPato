import { Pato } from "./Pato";
import { Voar_Foguete } from "./Voar_Foguete";
import { Pular_Alto } from "./Pular_Alto";

export class Pato_Bravo extends Pato {
    constructor() {
        super();
        this.setComportamento(new Voar_Foguete(), new Pular_Alto());
    }

    mostrar(): string {
        return "Eu sou um Pato Bravo!";
    }
}
