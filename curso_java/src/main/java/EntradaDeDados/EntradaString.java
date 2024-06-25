package EntradaDeDados;

import java.util.Scanner;

public class EntradaString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String x; 
        x = sc.next(); //Aguarda digitar
        System.out.println("Você digitou: " + x); // Texto SEM ESPAÇOS
        
        sc.close();
    }
    
}
