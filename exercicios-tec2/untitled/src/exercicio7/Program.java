package exercicio7;

public class Program {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        // atribuindo valores
        a1.setNome("Lucas");
        a1.setP1(9.0);
        a1.setP2(8.0);

        // mostrando os valores de a1
        System.out.println("A1 antes da atribuição" + a1);

        Aluno a2 = a1;
        a2.setP1(10.0);
        a2.setP2(9.0);

        // comparando
        System.out.println(a1);
        System.out.println(a2);
    }
}
