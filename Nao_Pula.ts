import { Padrao_Pular } from "./Padrao_Pular";

export class Nao_Pula implements Padrao_Pular {
    pular(): string {
        return "Este pato não pula.";
    }

    getAltura(): number {
        return 0;
    }
}
