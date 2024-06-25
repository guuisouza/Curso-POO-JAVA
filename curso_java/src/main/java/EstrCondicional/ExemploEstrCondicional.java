/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstrCondicional;

import java.util.Scanner;

public class ExemploEstrCondicional {
    //Exemplo de estrutura condicional composta com apenas 2 possibilidades
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hora;
        
        System.out.println("Quantas horas?");
        hora = sc.nextInt();
        
        if (hora < 12){
            System.out.println("Bom Dia!");
        }
        else {
            System.out.println("Boa Tarde!");
        }
        
        sc.close();
    }
}
