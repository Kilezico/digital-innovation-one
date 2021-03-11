package Sets;

import java.util.HashSet;

public class ExHashSet {

    public static void main(String[] args) {

        //3, 88, 20, 44, 3
        // Cria o Hashset e adiciona valores
        HashSet<Integer> meuSet = new HashSet<>();
        meuSet.add(3);
        meuSet.add(88);
        meuSet.add(20);
        meuSet.add(44);
        meuSet.add(3);

        // Exibe o Set no console
        for (int e: meuSet) {
            System.out.println(e);
        }

        // Remove o primeiro item do set
        Object[] meuSetArray = meuSet.toArray();
        meuSet.remove(meuSetArray[0]);
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
