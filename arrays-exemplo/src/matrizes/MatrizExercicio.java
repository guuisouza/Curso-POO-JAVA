package matrizes;

    //Fazer um programa para ler dois números inteiros M e N, e depois ler
    //uma matriz de M linhas por N colunas contendo números inteiros,
    //podendo haver repetições. Em seguida, ler um número inteiro X que
    //pertence à matriz. Para cada ocorrência de X, mostrar os valores à
    //esquerda, acima, à direita e abaixo de X, quando houver, conforme
    //exemplo.

import java.util.Scanner;

public class MatrizExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int occurence = sc.nextInt();

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++){
                if (occurence == mat[i][j]) {
                    System.out.println("Position: " + i + ", " + j);
                    if (j > 0) {
                        int leftValue = mat[i][j - 1];
                        System.out.println("Left: " + leftValue);
                    }
                    if (j < mat[i].length-1) {
                        int rigthValue = mat[i][j + 1];
                        System.out.println("Rigth: " + rigthValue);
                    }
                    if (i > 0) {
                        int upValue = mat[i - 1][j];
                        System.out.println("Up: " + upValue);
                    }
                    if (i < mat.length-1) {
                        int downValue = mat[i + 1][j];
                        System.out.println("Down: " + downValue);
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
