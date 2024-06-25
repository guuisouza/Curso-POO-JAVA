/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosEstrCondicional;

import java.util.Scanner;

public class Exercicio3 {

    /*
     Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
     Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
     ordem crescente ou decrescente.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos");
        } 
        else {
            System.out.println("Não são múltiplos");
        }
        sc.close();
    }
}
