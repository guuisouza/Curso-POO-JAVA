package exercicio5;

// 5.	Crie um programa que receba um valor inteiro informado pelo usuário e
// determine se esse valor é um número primo. Observe que os números primos
// são aqueles que são divisíveis apenas por eles próprios e por 1.

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int qtdeDivisiveis = 0;

        for(int i=1; i<=numero; i++) {
            if(numero % i == 0) {
                qtdeDivisiveis += 1;
            }
        }

        if (qtdeDivisiveis > 2) {
            System.out.printf("O valor %d não é primo!", numero );
        } else {
            System.out.printf("O valor %d é primo!", numero );
        }
    }
}
