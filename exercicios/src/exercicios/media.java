package abnerproject1;

import java.util.*;

public class media {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nt1, nt2, nt3, soma, media, freq;

        System.out.println("Digite as suas três notas");
        System.out.print("Digite a nota 1: ");
        nt1 = input.nextDouble();
        System.out.print("Digite a nota 2: ");
        nt2 = input.nextDouble();
        System.out.print("Digite a nota 3: ");
        nt3 = input.nextDouble();

        soma = nt1 + nt2 + nt3;

        media = soma / 3;

        System.out.println("Sua média é: " + media);

        System.out.print("Digite a sua frequencia (em decimal | Ex: 0.75):");
        freq = input.nextDouble();

        if (media >= 7.0 && freq >= 0.75) {
            System.out.print("Aprovado! :)");
        } else if (4.0 <= media && freq >= 0.75 || media < 7.0 && freq >= 0.75) {
            System.out.print("Em recuperação! ;O;");
        } else {
            System.out.print("REPROVADO! !!!YOU LOSER!!!");
        }

    };

}