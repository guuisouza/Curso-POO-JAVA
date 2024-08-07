package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    /*
        Fazer um programa para ler um número inteiro N e os dados (nome e
        preço) de N Produtos. Armazene os N produtos em um vetor. Em
        seguida, mostrar o preço médio dos produtos.
    */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Criando um vetor do tipo classe, que armazena objetos
        Product[] vect = new Product[n];

        // Substituindo n por vect.length faz com que olhe para o tamanho do vetor

        for (int i=0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            // Instancia um novo produto e o vect apontará para o objeto
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = $ %.2f%n", avg);

        sc.close();
    }
}
