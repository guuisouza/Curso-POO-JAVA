package exercicios.somavetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
   /*
    Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
    - Imprimir todos os elementos do vetor
    - Mostrar na tela a soma e a média dos elementos do vetor
   */
   public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       System.out.print("Quantos números você vai digitar? ");
       int n = sc.nextInt();

       double[] vect = new double[n];

       for (int i=0;i < vect.length;i++){
           System.out.print("Digite um número: ");
           vect[i] = sc.nextDouble();
       }

       System.out.println("VALORES = " + Arrays.toString(vect));

       double sum = 0.0;
       for (int i=0; i < vect.length; i++) {
           sum += vect[i];
       }

       double avg = sum / vect.length;

       System.out.println("SOMA = " + sum);
       System.out.println("MEDIA = " + avg);
   }
}
