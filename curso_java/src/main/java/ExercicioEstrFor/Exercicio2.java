
package ExercicioEstrFor;

import java.util.Scanner;


public class Exercicio2 {

    /*
     Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
     Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
     essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int somaIn = 0;
        int somaOut = 0;
        
        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            
            if (x > 9 && x < 21) {
                somaIn += 1;
            }else{
                somaOut += 1;
            }
        }
        System.out.printf("%d in%n", somaIn);       
        System.out.printf("%d out%n", somaOut);
        sc.close();
    }
}
