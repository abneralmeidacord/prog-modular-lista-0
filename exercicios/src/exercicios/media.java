import java.util.*;

public class media {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maior = 0, menor = 0, uniao = 0;
        int[] x, y, z;

        System.out.print("Digite o número de elementos em X: ");
        int m = input.nextInt();
        x = new int[m];

        System.out.print("Digite o número de elementos em y: ");
        int n = input.nextInt();
        y = new int[n];

        System.out.print("Digite os " + m + " elementos de x: ");
        for (int i = 0; i < m; i++) {
            x[i] = input.nextInt();
        }

        System.out.print("Digite os " + n + " elementos de y: ");
        for (int i = 0; i < m; i++) {
            y[i] = input.nextInt();
        }
        if (m > n) {
            maior = x.length;
            menor = y.length;

            for (int i = 0; i < maior; i++) {
                for (int j = 0; j < menor; j++) {
                    if (x[i] == y[j]) {
                        uniao++;
                    }
                }
            }

            z = new int[uniao];
            for (int i = 0; i < maior; i++) {
                for (int j = 0; j < menor; j++) {
                    if (x[i] == y[j]) {
                        z[uniao] = x[i];
                    }
                }
            }

        } else {
            maior = y.length;
            menor = x.length;

            for (int i = 0; i < maior; i++) {
                for (int j = 0; j < menor; j++) {
                    if (y[i] == x[j]) {
                        uniao++;
                    }
                }
            }

            z = new int[uniao];
            for (int i = 0; i < maior; i++) {
                for (int j = 0; j < menor; j++) {
                    if (y[i] == x[j]) {
                        z[uniao] = y[i];
                    }
                }
            }
        }
    }
}