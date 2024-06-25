package Funcoes;

public class FuncoesStrings {

    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    ";
        
        // Converter tudo para minúsculo e maiúsculo
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim(); // Remove espaços

        System.out.println("toLowerCase: -" + s01 + "-");        
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        
        // Substring
        String s04 = original.substring(2); // Monta uma nova string com os caracteres de 2 em diante
        String s05 = original.substring(2, 9); // Limite para recortar no final
        System.out.println("substring(2): " + s04);        
        System.out.println("substring(2, 9): " + s05);
        
        // Replace
        String s06 = original.replace('a', 'x'); // Sempre que acha um 'a' troca por um 'x'
        String s07 = original.replace("abc", "xy");
        System.out.println("replace (abc, xy): " + s06);
        System.out.println("replace (abc, xy): " + s07);
        
        // Index of
        int i = original.indexOf("bc"); // Posicao da primeira ocorrencia de bc
        System.out.println(i);
        int j = original.lastIndexOf("bc"); // Posicao da ultima ocorrencia de bc
        System.out.println(j);
    }  
}
