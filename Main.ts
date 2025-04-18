import { Pato_Borracha } from "./Pato_Borracha";
import { Pato_Bravo } from "./Pato_Bravo";
import { Pato_Ruivo } from "./Pato_Ruivo";

// Exemplo de uso do padrão Strategy com diferentes tipos de patos
function main() {
    const pato1 = new Pato_Borracha();
    const pato2 = new Pato_Bravo();
    const pato3 = new Pato_Ruivo();

    const patos = [pato1, pato2, pato3];

    patos.forEach(pato => {
        console.log(pato.mostrar());
        console.log(pato.nadar());
        console.log(pato.comportamento_pato());
        console.log("---------------------------");
    });
}

main();
