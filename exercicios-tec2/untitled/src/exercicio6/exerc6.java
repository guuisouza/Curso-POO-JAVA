package exercicio6;

//6.	Crie um programa que permita calcular o valor do salário líquido de um
//funcionário considerando o
//desconto do INSS. O desconto da contribuição do INSS e dado segundo a tabela:


import java.util.Locale;
import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.println("########################## ");
        System.out.println("Calculadora de INSS");
        System.out.println("########################## ");
        if(!(salarioBruto < 0.0)) {
            calcularInss(salarioBruto);
        } else {
            System.out.println("Insira um salário válido");
        }
        System.out.println("########################## ");
    }

    public static void calcularInss(double salarioBruto) {
        double aliquota = 0.0;
        double deducao = 0.0;
        double valorInss = 0.0;
        double salarioLiquido = 0.0;

        if (salarioBruto > 0.0 && salarioBruto <= 1212.00) {
            aliquota = 7.5;
            deducao = 0.0;

            valorInss = (salarioBruto * aliquota / 100) - deducao;
            salarioLiquido = salarioBruto - valorInss;
            System.out.println("Salário Bruto ...: " + salarioBruto);
            System.out.println("Alíquota INSS (%).: " + aliquota);
            System.out.println("Desconto INSS ……..: " + valorInss);
            System.out.println("Salário Líquido ..: " + salarioLiquido);

        } else if (salarioBruto <= 2427.35) {
            aliquota = 9.0;
            deducao = 18.18;

            valorInss = (salarioBruto * aliquota / 100) - deducao;
            salarioLiquido = salarioBruto - valorInss;
            System.out.println("Salário Bruto ...: " + salarioBruto);
            System.out.println("Alíquota INSS (%).: " + aliquota);
            System.out.println("Desconto INSS ……..: " + valorInss);
            System.out.println("Salário Líquido ..: " + salarioLiquido);
        } else if (salarioBruto <= 3641.03) {
            aliquota = 12.0;
            deducao = 91.00;

            valorInss = (salarioBruto * aliquota / 100) - deducao;
            salarioLiquido = salarioBruto - valorInss;
            System.out.println("Salário Bruto ...: " + salarioBruto);
            System.out.println("Alíquota INSS (%).: " + aliquota);
            System.out.println("Desconto INSS ……..: " + valorInss);
            System.out.println("Salário Líquido ..: " + salarioLiquido);
        } else if (salarioBruto <= 3641.03) {
            aliquota = 14.0;
            deducao = 163.82;

            valorInss = (salarioBruto * aliquota / 100) - deducao;
            salarioLiquido = salarioBruto - valorInss;
            System.out.println("Salário Bruto ...: " + salarioBruto);
            System.out.println("Alíquota INSS (%).: " + aliquota);
            System.out.println("Desconto INSS ……..: " + valorInss);
            System.out.println("Salário Líquido ..: " + salarioLiquido);
        }
    }
}
