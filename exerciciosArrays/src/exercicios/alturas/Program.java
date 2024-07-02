package exercicios.alturas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois,
        mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com
        menos de 16 anos, bem como os nomes dessas pessoas caso houver.
    */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int [n];
        double[] height = new double[n];

        for (int i=0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
        }

        double sumAvgHeight = 0.0;
        for (int i=0; i < height.length; i++) {
            sumAvgHeight += height[i];
        }

        int lessThan16 = 0;
        for (int i=0; i < age.length; i++) {
            if (age[i] < 16) {
                lessThan16 += 1;
            }
        }

        double percentage = (double) lessThan16 / n * 100.0;

        System.out.printf("Altura média: %.2f%n", sumAvgHeight/n);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentage);

        for (int i=0; i < age.length; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}
