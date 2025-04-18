import { Padrao_Voaveis } from "./Padrao_Voaveis";

export class Voar_Raso implements Padrao_Voaveis {
    voar(): string {
        return "Voando bem baixinho...";
    }

    getVelocidade(): number {
        return 5;
    }
}
