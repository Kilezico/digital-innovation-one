package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Ex01 {

    public static void main(String[] args) {

        // Cria fila e adiciona elementos
        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        // Navega na fila
        for (String nome: fila) {
            System.out.println("--> " + nome);
        }

        // Imprime primeiro item da fila sem remoção
        System.out.println("Primeiro item da fila sem remoção: " + fila.peek());

        // Imprime primeiro item da fila com remoção
        System.out.println("Primeiro item da fila com remoção: " + fila.poll());

        // Adiciona Daniel e verifica sua posição na fila
        fila.add("Daniel");
        System.out.println("Fila com Daniel: " + fila);
        int posição = 0;
        for (String e: fila) {
            if (e == "Daniel") {
                 break;
            }
            posição++;
        }
        if (posição != fila.size()) {
            System.out.println("Posição de Daniel na fila: " + posição);
        }

        // Imprime o tamanho da fila
        System.out.println("Tamanho da fila: " + fila.size());

        // Verifica se a fila está vazia
        System.out.println("A fila está vazia? " + fila.isEmpty());

        // Verifica se Carlos está na fila
        System.out.println("Carlos está na fila? " + fila.contains("Carlos"));

    }

}
