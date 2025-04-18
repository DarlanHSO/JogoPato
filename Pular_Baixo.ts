import { Padrao_Pular } from "./Padrao_Pular";

export class Pular_Baixo implements Padrao_Pular {
    pular(): string {
        return "Pulo baixo!";
    }

    getAltura(): number {
        return 1;
    }
}
