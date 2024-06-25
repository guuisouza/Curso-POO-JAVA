package EstrRepeticao;

import java.util.Scanner;

public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int soma = 0;
        
        for (int i=0; i<N; i++) {
            int N2 = sc.nextInt();
            soma += N2;
        }
        
        System.out.println(soma);
        sc.close();
        
        // contagem progressiva
        for (int i=0; i<5; i++) {
            System.out.println("Valor de i: " + i);
        }
        
        // contagem regressiva
        for (int i=4; i>=0; i--){
            System.out.println("Valor de i: " + i);
        }
    }
    
}
