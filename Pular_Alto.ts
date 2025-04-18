import { Padrao_Pular } from "./Padrao_Pular";

export class Pular_Alto implements Padrao_Pular {
    pular(): string {
        return "Pulo alto!";
    }

    getAltura(): number {
        return 5;
    }
}
