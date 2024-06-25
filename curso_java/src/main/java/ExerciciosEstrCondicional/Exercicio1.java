/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosEstrCondicional;

import java.util.Scanner;

public class Exercicio1 {
    //Fazer um programa para ler um número inteiro, e depois dizer se 
    //este número é negativo ou não.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        numero = sc.nextInt();
        
        if (numero > 0) {
            System.out.printf("Número: '%d' é positivo", numero);
        }
        else {
            System.out.printf("Número: '%d'é negativo", numero);
        }
        sc.close();
    }
}
