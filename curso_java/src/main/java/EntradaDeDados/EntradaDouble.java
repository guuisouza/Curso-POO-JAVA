package EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDouble {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double x; 
        x = sc.nextDouble(); //Aguarda digitar
        System.out.println("Você digitou: " + x); // Texto SEM ESPAÇOS
        
        sc.close();
    }
    
}
