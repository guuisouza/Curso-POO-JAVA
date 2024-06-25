
package ExerciciosEstrSequencial;

import java.util.Scanner;

public class Exercicio3 {
//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        //variáveis
        int A, B, C, D, diferenca;
        
        //entrada
        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        D = sc.nextInt();
        
        //processamento
        diferenca = ((A * B) - (C * D));
        //saída
        System.out.println("DIFERENÇA = %" + diferenca);
        sc.close();
    }
}
