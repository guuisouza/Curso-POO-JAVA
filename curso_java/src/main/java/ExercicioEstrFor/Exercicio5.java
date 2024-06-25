package ExercicioEstrFor;

import java.util.Scanner;


public class Exercicio5 {

    /*
     Ler um valor N. 
     Calcular e escrever seu respectivo fatorial. 
     Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
     Lembrando que, por definição, fatorial de 0 é 1.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int fatorial = n;
        
        for (int i=1; i<n; i++) {
                fatorial *= (n-i);       
        }
        
        if (n == 0){
            System.out.println(1);
        }else{
            System.out.println(fatorial);
        }    
    }
}
