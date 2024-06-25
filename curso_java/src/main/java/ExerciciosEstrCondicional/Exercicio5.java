/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosEstrCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    /*
     Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
     seguir, calcule e mostre o valor da conta a pagar.
     */
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int codigo, quantidade;
        double valor;
        
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigo == 1){
            valor = quantidade * 4.00;
        }
        else if (codigo == 2){
            valor = quantidade * 4.50;

        }
        else if (codigo == 3){
            valor = quantidade * 5.00;

        }
        else if (codigo == 4){
            valor = quantidade * 2.00;
            
        }
        else {
            valor = quantidade * 1.50;
        }
        
        System.out.printf("Total: R$ %.2f%n", valor);
        sc.close();
    }
}
