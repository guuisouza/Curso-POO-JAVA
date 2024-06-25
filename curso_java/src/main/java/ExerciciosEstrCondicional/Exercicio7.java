package ExerciciosEstrCondicional;
import java.util.Locale;
import java.util.Scanner;

//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

public class Exercicio7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String mensagem;
        double x = sc.nextDouble();        
        double y = sc.nextDouble();
        
        if (x == 0.0 && y == 0.0){
            mensagem = "Origem";
        }
        else if (x == 0.0){
            mensagem = "Eixo X";
        }
        else if (y == 0.0){
            mensagem = "Eixo Y";
        }
        else if (x > 0.0 && y > 0.0) {
            mensagem = "Q1";
        }
        else if (x > 0.0) {
            mensagem = "Q4";
        }
        else if (x < 0.0 && y < 0.0) {
            mensagem = "Q3";
        }
        else {
            mensagem = "Q2";
        }
        
        System.out.println(mensagem);
        sc.close();
 
    }   
}
