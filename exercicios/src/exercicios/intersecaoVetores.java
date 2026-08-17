import java.util.*;

public class intersecaoVetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o n: ");
        int n = input.nextInt();

        int[] progMod = new int[n];
        int[] calc = new int[n];

        int intersecoes = 0;

        System.out.println("Digite os Nºs de matrícula de Prog. Modular:");

        for (int i = 0; i < n; i++) {
            int matricula = input.nextInt();
            progMod[i] = matricula;
        }
        ;

        System.out.println("Digite os Nºs de matrícula Cálculo:");

        for (int i = 0; i < n; i++) {
            int matricula = input.nextInt();
            calc[i] = matricula;
        }
        ;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (progMod[i] == calc[j]) {
                    intersecoes++;
                }
            }
        }

        System.out.print("Segue o número de alunos matriculados nas duas matérias simultâneamente: " + intersecoes + "");
    }
}