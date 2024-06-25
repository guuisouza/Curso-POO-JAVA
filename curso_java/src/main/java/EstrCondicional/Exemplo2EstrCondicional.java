/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstrCondicional;

import java.util.Scanner;

/**
 *
 * @author pc gaming
 */
public class Exemplo2EstrCondicional {

    public static void main(String[] args) {
        //Estrutura condicional com mais de 2 possibilidades/Encadeamento;
        Scanner sc = new Scanner(System.in);
        
        int hora;
        
        System.out.println("Quantas horas?");
        hora = sc.nextInt();
        
        if (hora < 12){
            System.out.println("Bom Dia!");
        }
        else if (hora < 18) {
            System.out.println("Boa Tarde!");
        }
        else {
            System.out.println("Boa Noite!");
        }
               
        sc.close();
    }   
}
