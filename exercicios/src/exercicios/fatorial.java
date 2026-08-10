package abnerproject1;

import java.util.*;

public class fatorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, fat;
        System.out.print("Digite um número inteiro: ");

        x = input.nextInt();
        fat = x;

        while (x > 1 && x != 0) {
            fat = fat * (x - 1);
            x -= 1;
        }

        if (x == 0) {
            fat = 1;
        }

        System.out.println("O fatorial é: " + fat);
    }

}