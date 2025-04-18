import { Padrao_Voaveis } from "./Padrao_Voaveis";

export class Voaveis_Asa implements Padrao_Voaveis {
    voar(): string {
        return "Voando com as asas!";
    }

    getVelocidade(): number {
        return 10;
    }
}
