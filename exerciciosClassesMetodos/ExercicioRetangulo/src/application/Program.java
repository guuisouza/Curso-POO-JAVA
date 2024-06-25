package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
//    Fazer um programa para ler os valores da largura e altura
//    de um retângulo. Em seguida, mostrar na tela o valor de
//    sua área, perímetro e diagonal.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
        System.out.println("PERIMETER = " + String.format("%.2f", rectangle.perimeter()));
        System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
    }
}
