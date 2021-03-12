package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ExStream {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", 20));
        pessoas.add(new Pessoa("João", 18));
        pessoas.add(new Pessoa("Ana", 16));
        pessoas.add(new Pessoa("Florinda", 69));
        pessoas.add(new Pessoa("Beatriz", 5));
        pessoas.add(new Pessoa("Gabriel", 2));

        // Transforma cada pessoa em uma string com nome e idade
        System.out.println(pessoas.stream()
                .map((pessoa) -> pessoa.getNome() + " - " + pessoa.getIdade()).collect(Collectors.toList()));

        // Conta a quantidade de elementos
        System.out.println("Contagem: " + pessoas.stream().count());

        // Filtra as pessoas por idade
        System.out.println("Pessoas com 18 ou mais: ");
        System.out.println(pessoas.stream().filter(pessoa -> pessoa.getIdade() >= 18).collect(Collectors.toList()));

        // Exibe cada elemento no console
        pessoas.stream().forEach(System.out::println);

        // Retorna estudantes com a letra B no nome
        System.out.println("Nomes com a letra B:");
        System.out.println(pessoas.stream().filter(pessoa -> pessoa.getNome().toLowerCase().contains("b")).collect(Collectors.toList()));

        // Retorna se existe alguem com a letra D no nome
        System.out.print("Alguém tem a letra D? ");
        System.out.println(pessoas.stream().anyMatch(pessoa -> pessoa.getNome().toLowerCase().contains("d")));

        // Retorna a pessoa mais velha e mais nova
        System.out.print("Pessoa mais velha: ");
        pessoas.stream().max(Comparator.comparingInt(Pessoa::getIdade)).ifPresent(System.out::println);
        System.out.print("Pessoa mais nova: ");
        pessoas.stream().min(Comparator.comparingInt(Pessoa::getIdade)).ifPresent(System.out::println);

    }

}

class Pessoa {

    final private String nome;
    final private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

}