package ExerciciosEstrSequencial;


import java.util.Locale;
import java.util.Scanner;


public class Exercicio2 {
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //variáveis
        double raio;
        double pi = 3.14159;
        double area;
        
        //entrada
        System.out.println("Digite o valor do raio do círculo: ");
        raio = sc.nextDouble();
        
        //processamento
        area = pi * (Math.pow(raio, 2.0));
        //saída
        System.out.printf("A = %.4f%n", area);
        sc.close();
    }
}
