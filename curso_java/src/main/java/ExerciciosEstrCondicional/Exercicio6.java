/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosEstrCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    /*
     Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem 
     dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
     este valor se encontra. Obviamente se o valor não estiver em
     nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
     */
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double numero;
        numero = sc.nextDouble();
        
        if (numero >= 0.0 && numero <= 25.0){
            System.out.println("Intervalo [0, 25]");
        }
        else if (numero > 25.0 && numero <= 50.0){
            System.out.println("Intervalo [25, 50]");
        }
        else if (numero > 50.0 && numero <= 75.0){
            System.out.println("Intervalo [50, 75]");
        }
        else if (numero > 75.0 && numero <= 100.0){
            System.out.println("Intervalo [75, 100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }   
        sc.close();
    }  
}
