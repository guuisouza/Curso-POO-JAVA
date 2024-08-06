package exercicioFixacao.application;

import entities.enums.OrderStatus;
import exercicioFixacao.entities.Client;
import exercicioFixacao.entities.Order;
import exercicioFixacao.entities.OrderItem;
import exercicioFixacao.entities.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String date = sc.next();
        LocalDate birthDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Client client = new Client(birthDate, email, name);

        System.out.println("Enter order data:");
        System.out.print("Status (STATUS): ");
        String status = sc.next();
        System.out.print("How many items to this order? ");
        int items = sc.nextInt();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        for (int i=1; i<= items; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice,product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMARY: ");
        System.out.println(order);
    }
}
