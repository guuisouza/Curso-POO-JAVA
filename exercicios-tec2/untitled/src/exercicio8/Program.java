package exercicio8;

public class Program {
    public static void main(String[] args) {

        // nao compreendi muito bem o objetivo desse exercicio

        int[] X = {2, 7, 4, 3, 2};
        int[] Y = {1, 2, 3, 6, 5};

        // a) Somatório de X
        int somaA = 0;
        for (int x : X) {
            somaA += x;
        }

        // b) Somatório do produto de X e Y
        int somaB = 0;
        for (int i = 0; i < X.length; i++) {
            somaB += X[i] * Y[i];
        }

        // c) Somatório de X * Y^2
        int somaC1 = 0;
        for (int j = 1; j < 4; j++) {
            somaC1 += X[j] * (Y[j] * Y[j]);
        }

        int somaC2 = 0;
        for (int j = 0; j < 5; j++) {
            somaC2 += 3;
        }

        int somaC = somaC1 + somaC2;

        System.out.println("Soma de a: " + somaA);
        System.out.println("Soma de b: " + somaB);
        System.out.println("Soma de c: " + somaC);
    }
}
