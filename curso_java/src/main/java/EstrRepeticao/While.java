
package EstrRepeticao;

import java.util.Scanner;

public class While {
    /*
        while = enquanto
        Utilizar quando NÃO se sabe previamente a quantidade de repetições necessárias
        Exercicio: Fazer um programa que lê números
        inteiros até que um zero seja lido. Ao
        final mostra a soma dos números lidos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int soma = 0;
        
        while (number!= 0){
            soma += number;
            number = sc.nextInt();
        }
        System.out.println(soma);
        sc.close();
    }
}
