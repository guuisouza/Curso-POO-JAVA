package exercicios.pensionato.application;

import exercicios.pensionato.entities.Rent;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] rentRoom = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int roomsRented = sc.nextInt();

        for (int i=1; i<=roomsRented; i++) {
            System.out.println("Rent #" + i + ":" );
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room (0-9): ");
            int room = sc.nextInt();
            System.out.println();

            rentRoom[room] = new Rent(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (int i=0; i<rentRoom.length; i++) {
            if (rentRoom[i] != null) {
                System.out.println(rentRoom[i]);
            }
        }

        sc.close();
    }
}
