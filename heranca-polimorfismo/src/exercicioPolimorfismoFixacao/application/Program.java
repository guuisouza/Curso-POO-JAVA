package exercicioPolimorfismoFixacao.application;

import exercicioPolimorfismoFixacao.entities.ImportedProduct;
import exercicioPolimorfismoFixacao.entities.Product;
import exercicioPolimorfismoFixacao.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> p = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Product " + i +  " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(productType == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                p.add(new ImportedProduct(name, price, customsFee));
            }
            else if(productType == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                p.add(new UsedProduct(name, price, date));
            } else {
                p.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product x : p){
            System.out.println(x.priceTag());
        }
    }
}
