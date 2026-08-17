import java.util.*;

public class uniaoVetores {

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
        for (int i = 0; i < n; i++) {
            y[i] = input.nextInt();
        }
        if (m > n) {
            maior = m;
            menor = n;

            for (int i = 0; i < maior; i++) {
                for (int j = 0; j < menor; j++) {
                    if (x[i] == y[j]) {
                        uniao++;
                    }
                }
            }

            z = new int[uniao];
            int percorre = 0;
            for (int i = 0; i < maior; i++) {
                for (int j = 0; j < menor; j++) {
                    if (x[i] == y[j]) {
                        z[percorre] = x[i];
                    }
                }
            }

        } else {
            maior = n;
            menor = m;

            for (int i = 0; i < maior; i++) {
                for (int j = 0; j < menor; j++) {
                    if (y[i] == x[j]) {
                        uniao++;
                    }
                }
            }

            z = new int[uniao];
            int percorre = 0;
            for (int i = 0; i < maior; i++) {
                for (int j = 0; j < menor; j++) {
                    if (y[i] == x[j]) {
                        z[percorre] = y[i];
                        percorre++;
                    }
                }
            }
        };

        for (int i = 0; i < z.length; i++)
            System.out.print(z[i] + " ");
    }
}