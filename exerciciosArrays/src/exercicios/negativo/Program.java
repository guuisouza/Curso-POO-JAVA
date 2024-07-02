package exercicios.negativo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
        Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N
        números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos
        os números negativos lidos.
    */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        if (n > 10) {
            System.out.println("Por favor, insira um valor menor que 10!");
            n = sc.nextInt();
        }

        int[] vect = new int[n];

        for (int i=0; i< vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i=0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
    }
}
