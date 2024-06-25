package EstrRepeticao;

import java.util.Scanner;

public class ExercicioWhile3 {

    /*
     Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
     um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
     4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
     que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
     mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
     exemplo.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int codigo = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        while (codigo != 4){
            if (codigo <1 || codigo > 4) {
                System.out.println("Digite um código válido: ");
            }
            else if (codigo == 1) {
                alcool += 1;
            }
            else if (codigo == 2) {
                gasolina += 1;
            }
            else {
                diesel += 1;
            }
            codigo = sc.nextInt();
        }
        
        System.out.printf("MUITO OBRIGADO %n Álcool: %d%n Gasolina: %d%n Diesel: %d%n", alcool, gasolina, diesel);
    }  
}
