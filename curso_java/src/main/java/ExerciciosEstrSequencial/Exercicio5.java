/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosEstrSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
//o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e 
//o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
       // variaveis
       int codPeca1, numPeca1, codPeca2, numPeca2;
       double valorUnitPeca1, valorUnitPeca2, valorParaPagar;
       
       codPeca1 = sc.nextInt();
       numPeca1 = sc.nextInt();
       valorUnitPeca1 = sc.nextDouble();
       
       codPeca2 = sc.nextInt();
       numPeca2 = sc.nextInt();
       valorUnitPeca2 = sc.nextDouble();
       
       valorParaPagar = ((numPeca1 * valorUnitPeca1) + (numPeca2 * valorUnitPeca2));
       
       System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorParaPagar);
       sc.close();
    }
}
