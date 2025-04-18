import { Pato } from "./Pato";
import { Nao_Voa } from "./Nao_Voa";
import { Nao_Pula } from "./Nao_Pula";

export class Pato_Borracha extends Pato {
    constructor() {
        super();
        this.setComportamento(new Nao_Voa(), new Nao_Pula());
    }

    mostrar(): string {
        return "Eu sou um Pato de Borracha!";
    }
}
