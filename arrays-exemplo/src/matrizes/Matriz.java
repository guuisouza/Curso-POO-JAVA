package matrizes;

    /*
        Fazer um programa para ler um número inteiro N e uma matriz de
        ordem N contendo números inteiros. Em seguida, mostrar a diagonal
        principal e a quantidade de valores negativos da matriz.
    */

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i=0; i< matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i=0; i< matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++){
                if (matriz[i][j] < 0) {
                    count += 1;
                }
            }
        }

        System.out.println("Negative numbers = " + count);
        sc.close();
    }
}
