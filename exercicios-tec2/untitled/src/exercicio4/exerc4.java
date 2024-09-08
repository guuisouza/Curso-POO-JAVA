package exercicio4;
//4.	Crie um programa que receba um número inteiro n e leia n valores do teclado e
//compute quantos destes valores são negativos.

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos números você quer: ");
        int n = sc.nextInt();

        System.out.printf("Digite seus %d números: ", n);
        System.out.println();

        int qtdeNegativos = 0;
        for(int i=0; i<n; i++) {
            int numero = sc.nextInt();
            if (numero < 0) {
                qtdeNegativos += 1;
            }
        }

        System.out.println("A quantidade de números negativos digitados é: " + qtdeNegativos);

    }
}
