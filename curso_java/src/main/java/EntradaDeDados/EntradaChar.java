package EntradaDeDados;

import java.util.Scanner;

public class EntradaChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char x; 
        x = sc.next().charAt(0); //charAt(0) pega o primeiro caractere do String
        System.out.println("Você digitou: " + x); // Texto SEM ESPAÇOS
        
        sc.close();
    }
    
}
