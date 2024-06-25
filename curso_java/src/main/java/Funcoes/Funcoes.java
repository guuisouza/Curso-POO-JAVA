
package Funcoes;

import java.util.Scanner;


public class Funcoes {
    //Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        int higher = max(n1, n2, n3);
        showHigher(higher);
        
        sc.close();
    }
    
    // Criando nossa própria função que retorna o maior número
    public static int max(int x, int y, int z){
         int maior;
        
        if (x > y && x > z) {
            maior = x;
        }
        else if (y > z) {
            maior = y;
        }
        else {
            maior = z;
        }
        return maior;
    }
    
    // Função que irá fazer uma ação sem retornar nenhum valor pra ser reaproveitado
    // Retorna vazio = VOID
    public static void showHigher(int value) {
        System.out.println("O maior valor é = " + value);
    }
}
