/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstrRepeticao;

import java.util.Scanner;
    /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
    */
public class ExercicioWhile1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int senhaValida = 2002;
        int senhaAdivinhar = sc.nextInt();
        
        while (senhaAdivinhar != senhaValida){
            System.out.println("Senha inválida");
            senhaAdivinhar = sc.nextInt();
        }
        
        System.out.println("Acesso permitido!");
        sc.close();
    }
}
