package EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaVariosDados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Declarando variáveis
        String x;
        int y;
        double z;
        
        // Lendo as variáveis - Recebendo os dados
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        
        // Imprimindo os valores
        System.out.println();
        System.out.println("Você digitou os seguintes dados: ");
        System.out.println("Você digitou a String: " + x);
        System.out.println("Você digitou o número inteiro: " + y);
        System.out.printf("Você digitou o número flutuante: %.2f%n", z);
        
        sc.close();
    }
    
}
