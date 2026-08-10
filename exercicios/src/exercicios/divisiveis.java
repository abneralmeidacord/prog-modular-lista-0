package abnerproject1;

import java.util.*;

public class divisiveis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z, maior, menor;
        boolean inIntervalo, isDivisivel;

        System.out.println("Digite três valores");
        System.out.print("Digite x: ");
        x = input.nextInt();
        System.out.print("Digite y: ");
        y = input.nextInt();
        System.out.print("Digite z: ");
        z = input.nextInt();

        int[] valores = { x, y, z };

        Arrays.sort(valores);
        maior = valores[2];
        menor = valores[0];

        inIntervalo = false;
        isDivisivel = false;

        if ((y <= x && x <= z) || (z <= x && x <= y)) {
            inIntervalo = true;
        }
        if (x % z == 0 && x % y == 0) {
            isDivisivel = true;
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("Está no intervalo de y e z? " + inIntervalo);
        System.out.println("Está fora intervalo de y e z? " + !inIntervalo);
        System.out.println("É divisível de y e z? " + isDivisivel);
    }

}