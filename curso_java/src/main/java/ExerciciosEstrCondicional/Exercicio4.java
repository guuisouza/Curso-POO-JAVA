/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExerciciosEstrCondicional;

import java.util.Scanner;

public class Exercicio4 {

    /*
        Leia a hora inicial e a hora final de um jogo. 
        A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e 
        máxima de 24 horas.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hInicial, hFinal, duracao;

        hInicial = sc.nextInt();
        hFinal = sc.nextInt();
        
        if (hInicial < hFinal ) {
            duracao = hFinal - hInicial;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        }
        else {
            duracao = 24 - hInicial + hFinal;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        }
        sc.close();
    }

}
