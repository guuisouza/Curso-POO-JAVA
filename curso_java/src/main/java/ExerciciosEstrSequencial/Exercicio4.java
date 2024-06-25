/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosEstrSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    //decimais.
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
         
        // Variáveis
        int number, horas;
        double valorPorHora, salario;
        
        // Processamento
        System.out.println("Informe o número do funcionário");
        number = sc.nextInt();
        System.out.println("Informe as horas trabalhadas do funcionário");
        horas = sc.nextInt();
        System.out.println("Informe o valor por hora deste funcionário");
        valorPorHora = sc.nextDouble();
        
        // Processamento - Calculo do salário
        salario = (horas * valorPorHora);
        
        // Saída
        System.out.println("NUMBER =" + number);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        sc.close();
    }   
}
