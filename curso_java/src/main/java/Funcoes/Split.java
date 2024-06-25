package Funcoes;

public class Split {

    public static void main(String[] args) {
        // Operação split serve para RECORTAR uma string
        String s = "potato apple lemon";
        
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
    
}
