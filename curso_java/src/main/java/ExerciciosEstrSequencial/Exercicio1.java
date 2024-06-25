
package ExerciciosEstrSequencial;

import java.util.Scanner;

public class Exercicio1 {
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x;
        int y;
        int soma;
        
        //entrada
        System.out.println("Digite o primeiro valor: ");
        x = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        y = sc.nextInt();
        
        //processamento
        soma = x + y;
        //saída
        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
