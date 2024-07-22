package for_each;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {

        String[] vect =  new String[] {
            "Maria", "Bob", "Alex"
        };

        // Usando o for para imprimir cada item do vetor
//        for (int i=0; i<vect.length; i++) {
//            System.out.println(vect[i]);
//        }

        // Usando o for each ele percorre todos os elementos do vect
        // Os chamando de "nomes". Parametros: (Tipo nomeparaelementos : colecao)
        for (String nomes : vect) {
            System.out.println(nomes);
        }
    }
}
