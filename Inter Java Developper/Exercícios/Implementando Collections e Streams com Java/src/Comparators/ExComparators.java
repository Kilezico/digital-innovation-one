package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExComparators {

    public static void main(String[] args) {

        // Cria lista e adiciona alunos
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(new Aluno("Marquinhos", 7.5));
        listaAlunos.add(new Aluno("João", 9.75));
        listaAlunos.add(new Aluno("Maria", 8.6));
        listaAlunos.add(new Aluno("Ana", 6.2));
        listaAlunos.add(new Aluno("Pablo", 6.9));

        System.out.println("Sem ordenação: ");
        System.out.println(listaAlunos);

        // Ordena com Comparable e Collections.sort
        Collections.sort(listaAlunos);
        System.out.println("Com ordenação: \n" + listaAlunos);

        // Ordena com implemetação de Comparator
        listaAlunos.sort(new ComparadorAlunos());
        System.out.println("Com ordeção reversa: \n" + listaAlunos);

        // Ordena com expressão lambda
        listaAlunos.sort((a1, a2) -> Double.compare(a2.getNota(), a1.getNota()));
        System.out.println("Com ordenação: \n" + listaAlunos);

        // Ordena com método estático de Comparator
        listaAlunos.sort(Comparator.comparingDouble(Aluno::getNota));
        System.out.println("Com ordenação reversa: \n" + listaAlunos);



    }

}

class Aluno implements Comparable<Aluno>{

    private double nota;
    private String nome;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return Double.compare(aluno.getNota(), nota);
    }

    @Override
    public String toString() {
        return nome + " - " + nota;
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }
}

class ComparadorAlunos implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }

}