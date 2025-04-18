import { Padrao_Voaveis } from "./Padrao_Voaveis";

export class Nao_Voa implements Padrao_Voaveis {
    voar(): string {
        return "Este pato não voa.";
    }

    getVelocidade(): number {
        return 0;
    }
}
