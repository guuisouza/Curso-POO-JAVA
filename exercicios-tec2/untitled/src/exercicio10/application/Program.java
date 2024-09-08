package exercicio10.application;

import exercicio10.entities.Venda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Venda> list = new ArrayList<>();
        System.out.println("Informe as 10 vendas: ");
        System.out.println();

        for(int i=0; i<10; i++) {
            System.out.println("Informe a venda " + (i + 1) + ":");
            System.out.print("Código do produto: ");
            String codigoProduto = sc.nextLine();
            System.out.print("Valor unitário: ");
            double valorUnitario = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine();  // Consume newline

            Venda venda = new Venda(codigoProduto, valorUnitario, quantidade);
            list.add(venda);

            System.out.println("O valor desta venda foi: " + venda.valorDaVenda());
        }

        Venda maiorVenda = Venda.maiorVenda(list);
        Venda menorVenda = Venda.menorVenda(list);
        double totalVendido = Venda.calcularValorTotalVendido(list);
        int quantidadeTotalItens = Venda.calcularQuantidadeTotalItens(list);
        double valorMedioVendido = Venda.calcularValorMedioVendido(list);

        System.out.println();
        System.out.printf("Valor médio vendido: R$ %.2f\n", valorMedioVendido);
        System.out.println("Produto com maior venda: " + maiorVenda + ", Valor: " + maiorVenda.valorDaVenda());
        System.out.println("Produto com menor venda: " + menorVenda + ", Valor: " + menorVenda.valorDaVenda());
        System.out.printf("Valor total vendido: R$ %.2f\n", totalVendido);
        System.out.println("Quantidade total de itens vendidos: " + quantidadeTotalItens);
        sc.close();
    }
}
