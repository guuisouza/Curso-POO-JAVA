package Listas;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // Declarando uma lista de números inteiros e instanciando a interface lista
        // com uma classe que IMPLEMENTA esta interface.
        // Generics <> -> Parametrizar a definição de um tipo informando um outro tipo
        List<String> list = new ArrayList<>();

        // adicionando dados na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        // adicionando em uma posição desejada
        list.add(2, "Marcos");

        // imprimindo tamanho da lista
        System.out.println(list.size());

        // imprimindo os valors com for each
        for (String names : list) {
            System.out.println(names);
        }

        System.out.println("---------------");

        // removendo um dado usando a comparação do valor passado com o da lista
//        list.remove("Anna");
//        list.remove(1); // pos 01

        // removendo através de um predicado, todos que começam com "M" - lambda predicado
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String names : list) {
            System.out.println(names);
        }

        System.out.println("---------------");
        // encontrar a posição de um elemento
        System.out.println("Index of bob: " + list.indexOf("Bob"));
        System.out.println("Index of marco: " + list.indexOf("Marco")); // Nao encontra
        System.out.println("---------------");

        // Deixar na lista somente quem começa com a letra A
        // Criaremos uma nova lista para armazenar quem começa com A
        // o stream é um tipo especial que aceita operações com expressões lambda
        // converte para stream, faz a operação lambda e no final converte para lista com o .toList();
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------");

        // Encontrar a primeiro elemento de algo com base em predicado, nome que começa com "A"
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
