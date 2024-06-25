package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    /*
     Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
     válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
     possui a maior área.
    */
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangle x, y; // Declara as variáveis x e y como 2 TRIANGULOS no satck (memória).
        // Para usar o objeto e para que ele exista precisamos INSTANCIAR.
        x = new Triangle(); // new faz uma alocação dinâmica de memória
        y = new Triangle(); // cria um objeto do tipo TRIANGLE na área de memória heap (dinâmico)
        
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        // Chamando um método que calcula a área
        double areaX = x.area();
        
        double areaY = y.area();
        
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else if (areaY > areaX) {
            System.out.println("Larger area: Y");
        } else {
            System.out.println("Equal area");
        }
        sc.close();   
    } 
}
