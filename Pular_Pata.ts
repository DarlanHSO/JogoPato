import { Padrao_Pular } from "./Padrao_Pular";

export class Pular_Pata implements Padrao_Pular {
    pular(): string {
        return "Pulo estilo pata!";
    }

    getAltura(): number {
        return 2;
    }
}
