package EntradaDeDados;

import java.util.Scanner;

public class EntradaInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x; 
        x = sc.nextInt(); //Aguarda digitar
        System.out.println("Você digitou: " + x); // Texto SEM ESPAÇOS
        
        sc.close();
    }
    
}
