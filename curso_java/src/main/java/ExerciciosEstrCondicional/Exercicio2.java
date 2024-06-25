/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosEstrCondicional;

import java.util.Scanner;

public class Exercicio2 {
    /*
     Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("Número PAR");
        }
        else {
            System.out.println("Número IMPAR");
        }
    }
}
