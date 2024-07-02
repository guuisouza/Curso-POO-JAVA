import java.util.Locale;
import java.util.Scanner;

public class Vetor1 {
    /*
        Fazer um programa para ler um número inteiro N e a altura de N
        pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
        altura média dessas pessoas.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Dizer primeiro o tipo de dado que o vetor receberá: Double;
        // Aqui criamos um vetor do tipo valor

        double[] vect = new double[n];

        for (int i=0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i < n; i++){
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }
}