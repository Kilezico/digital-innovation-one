package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex01 {

    public static void main(String[] args) {
        // Instancia uma nova lista
        List<String> minhaLista = new ArrayList<>();
        // Adiciona nomes
        minhaLista.add("Juliana");
        minhaLista.add("Pedro");
        minhaLista.add("Carlos");
        minhaLista.add("Larissa");
        minhaLista.add("João");

        // Navega e exibe
        for (String nome: minhaLista) {
            System.out.println("-> " + nome);
        }

        // Substitui Carlos por Roberto
        minhaLista.set(minhaLista.indexOf("Carlos"), "Roberto");
        System.out.println("Trocado Carlos por Roberto: " + minhaLista);

        // Retorna o nome da posição 1
        System.out.println("Posição 1: " + minhaLista.get(1));

        // Remove o nome da posição 3
        minhaLista.remove(3);
        System.out.println("Posição 3 removida: " + minhaLista);

        // Remove o nome João
        minhaLista.remove("João");
        System.out.println("Sem o João: " + minhaLista);

        // Imprime a quantidade de itens da lista
        System.out.println("Tamanho da lista: " + minhaLista.size());

        // Cria outra lista
        List<String> minhaOutraLista = new ArrayList<>();
        minhaOutraLista.add("Ismael");
        minhaOutraLista.add("Rodrigo");
        System.out.println("Nova lista: " + minhaOutraLista);

        // Junta as duas listas
        minhaLista.addAll(minhaOutraLista);
        System.out.println("As duas listas juntas: " + minhaLista);

        // Organiza a lista
        Collections.sort(minhaLista);
        System.out.println("Ordem alfabética: " + minhaLista);

        // Verifica se está vazia
        boolean estaVazia = minhaLista.isEmpty();
        System.out.println("Está vazia? " + estaVazia);

        minhaLista.clear();

        estaVazia = minhaLista.isEmpty();
        System.out.println("E agora? " + estaVazia);

    }

}
