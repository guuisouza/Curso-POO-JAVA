package boxing_unboxing_wrapperclasses;

public class BoxingAndUnboxing {
    public static void main(String[] args) {

        int x = 20;

        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;

        System.out.println(y);

        // Wrapper classes
        /*
            São classes que tem o objetivo de tratar os tipos primitivos como classes
            de forma transparente ao compilador, sem precisar fazer casting
            Integer, Float, Boolean etc... - São equivalentes aos tipos primitivos

            Wrapper classes aceitam valores nulos, que podem ser usado em campos de entidades
        */

        int z = 20;
        Integer obj2 = z;
        System.out.println(obj2);

        int v = obj2;

        System.out.println(v);
    }
}
