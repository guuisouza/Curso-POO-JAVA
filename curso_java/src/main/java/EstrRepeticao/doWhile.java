package EstrRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class doWhile {

    /*
      Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
      Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
      programa.

     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        char resp;
        
        do{
            System.out.println("Digite a temperatura em Celsius: ");
            double fahrenheit;
            double celsius = sc.nextDouble();
            
            fahrenheit = (((9.0 * celsius) / 5.0) + 32.0 );
            
            System.out.printf("Temperatura em Fahrenheit: %.1f%n", fahrenheit);
            System.out.println("Deseja repetir a operação? (s/n)");
            
            resp = sc.next().charAt(0);
            resp = Character.toLowerCase(resp);
        }while(resp == 's');
        
        sc.close();
    }
}
