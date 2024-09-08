package exercicio10.entities;

import java.util.List;

public class Venda {
    private String codProduto;
    private Double valorUnitario;
    private Integer quantidade;

    public Venda() {
    }

    public Venda(String codProduto, Double valorUnitario, Integer quantidade) {
        this.codProduto = codProduto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double valorDaVenda() {
        return this.valorUnitario * this.quantidade;
    }

    @Override
    public String toString() {
        return "Código: " + codProduto + ", Quantidade: " + quantidade;
    }

    public static Venda maiorVenda(List<Venda> vendas) {
        Venda maiorVenda = vendas.get(0);
        for (Venda venda : vendas) {
            if (venda.valorDaVenda() > maiorVenda.valorDaVenda()) {
                maiorVenda = venda;
            }
        }
        return maiorVenda;
    }

    public static Venda menorVenda(List<Venda> vendas) {
        Venda menorVenda = vendas.get(0);
        for (Venda venda : vendas) {
            if (venda.valorDaVenda() < menorVenda.valorDaVenda()) {
                menorVenda = venda;
            }
        }
        return menorVenda;
    }

    public static double calcularValorTotalVendido(List<Venda> vendas) {
        double totalVendido = 0;
        for (Venda venda : vendas) {
            totalVendido += venda.valorDaVenda();
        }
        return totalVendido;
    }

    public static int calcularQuantidadeTotalItens(List<Venda> vendas) {
        int quantidadeTotalItens = 0;
        for (Venda venda : vendas) {
            quantidadeTotalItens += venda.getQuantidade();
        }
        return quantidadeTotalItens;
    }

    public static double calcularValorMedioVendido(List<Venda> vendas) {
        double totalVendido = calcularValorTotalVendido(vendas);
        return totalVendido / vendas.size();
    }
}
