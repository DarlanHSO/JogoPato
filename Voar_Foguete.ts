import { Padrao_Voaveis } from "./Padrao_Voaveis";

export class Voar_Foguete implements Padrao_Voaveis {
    voar(): string {
        return "Voando como um foguete!";
    }

    getVelocidade(): number {
        return 100;
    }
}
