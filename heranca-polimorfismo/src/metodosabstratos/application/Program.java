package metodosabstratos.application;

import metodosabstratos.entities.Circle;
import metodosabstratos.entities.Rectangle;
import metodosabstratos.entities.Shape;
import metodosabstratos.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Para usar o polimorfismo devemos declarar a lista do tipo da super classe
        List<Shape> list = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                Shape shape = new Rectangle(color, width, height);
                list.add(shape);
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                Shape shape = new Circle(color, radius);
                list.add(shape);
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS");
        for(Shape shape : list){
            System.out.printf("%.2f%n", shape.area());
        }
    }
}
