package exercicio9;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a taxa Selic anual (%): ");
        double taxaSelic = scanner.nextDouble() / 100;

        System.out.print("Informe o capital para aplicação: ");
        double capitalInicial = scanner.nextDouble();

        double rendimentoBancoPagueMais = calcularBancoPagueMais(taxaSelic, capitalInicial);
        double rendimentoFuraBolso = calcularFuraBolso(taxaSelic, capitalInicial);

        // comparacao final
        if (rendimentoBancoPagueMais > rendimentoFuraBolso) {
            System.out.println("\nO CDB Banco Pague Mais foi o mais vantajoso.");
        } else {
            System.out.println("\nO CDB Fura Bolso foi o mais vantajoso.");
        }

        scanner.close();
    }

    // metodo para calcular rendimento CDB Banco Pague Mais
    public static double calcularBancoPagueMais(double taxaSelic, double capitalInicial) {
        double taxaBancoPagueMais = 0.85 * taxaSelic;
        double capital = capitalInicial;
        double rendimentoTotal = 0;
        double taxaAdmin = 0.10;

        System.out.println(" CDB Banco Pague Mais:");
        System.out.println("Mes Capital Rendimento Total");
        for (int mes = 1; mes <= 12; mes++) {
            double rendimento = capital * (taxaBancoPagueMais / 12);
            double rendimentoLiquido = rendimento * (1 - taxaAdmin);
            rendimentoTotal += rendimentoLiquido;
            capital += rendimentoLiquido;
            imprimirResultado(mes, capital - rendimentoLiquido, rendimentoLiquido, capital);
        }

        System.out.printf("Rendimento Total: %.2f%n", rendimentoTotal);
        return rendimentoTotal;
    }

    // metodo para calcular rendimento CDB Fura Bolso
    public static double calcularFuraBolso(double taxaSelic, double capitalInicial) {
        double taxaFuraBolso = 0.93 * taxaSelic;
        double taxaAdminFuraBolso = 0.01; // 1% sobre o capital inicial
        double impostoFuraBolso = 0.06; // 6% sobre o rendimento
        double capital = capitalInicial;
        double rendimentoTotal = 0;
        double descontoAdmin = capitalInicial * taxaAdminFuraBolso;

        System.out.println("CDB Fura Bolso:");
        System.out.println("Mes Capital Rendimento Total");
        for (int mes = 1; mes <= 12; mes++) {
            double rendimento = capital * (taxaFuraBolso / 12);
            double rendimentoLiquido = rendimento * (1 - impostoFuraBolso);
            rendimentoTotal += rendimentoLiquido;
            capital += rendimentoLiquido;
            imprimirResultado(mes, capital - rendimentoLiquido, rendimentoLiquido, capital);
        }

        System.out.printf("Rendimento Total: %.2f%n", rendimentoTotal);
        System.out.printf("Descontos: %.2f%n", descontoAdmin);
        System.out.printf("Rendimento Líquido: %.2f%n", rendimentoTotal - descontoAdmin);

        return rendimentoTotal - descontoAdmin;
    }

    // metodo para imprimir os resultados mês a mês
    public static void imprimirResultado(int mes, double capitalAnterior, double rendimento, double capitalAtual) {
        System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f%n", mes, capitalAnterior, rendimento, capitalAtual);
    }
}
