package Sets;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class ExTreeSet {

    public static void main(String[] args) {

        // 3, 88, 20, 44, 3
        // Cria o set e adiciona os elementos
        TreeSet<Integer> meuSet = new TreeSet<>();
        meuSet.add(3);
        meuSet.add(88);
        meuSet.add(20);
        meuSet.add(44);
        meuSet.add(3);

        // Navega e exibe o Set
        for (int e: meuSet) {
            System.out.println(e);
        }

        // Remove o primeiro item do Set
        meuSet.pollFirst();
        System.out.println(meuSet);

        // Adiciona o número 23
        meuSet.add(23);
        System.out.println(meuSet);

        // Verifica o tamanho do Set
        System.out.println(meuSet.size());

        // Verifica se o Set está vazio
        System.out.println(meuSet.isEmpty());

    }

}
