package Maps;

import java.util.Hashtable;

public class ExHashtable {

    public static void main(String[] args) {

        // Cria o mapa e adiciona os estados brasileiros
        Hashtable<String, String> meuMap = new Hashtable<>();
        meuMap.put("AC", "Acre");
        meuMap.put("AL", "Alagoas");
        meuMap.put("AP", "Amapá");
        meuMap.put("AM", "Amazonas");
        meuMap.put("BA", "Bahia");
        meuMap.put("CE", "Ceará");
        meuMap.put("ES", "Espírito Santo");
        meuMap.put("GO", "Goiás");
        meuMap.put("MA", "Maranhão");
        meuMap.put("MT", "Mato Grosso");
        meuMap.put("MS", "Mato Grosso do Sul");
        meuMap.put("MG", "Minas Gerais");
        meuMap.put("PA", "Pará");
        meuMap.put("PB", "Paraíba");
        meuMap.put("PR", "Paraná");
        meuMap.put("PE", "Pernambuco");
        meuMap.put("PI", "Piauí");
        meuMap.put("RJ", "Rio de Janeiro");
        meuMap.put("RN", "Rio Grande do Norte");
        meuMap.put("RS", "Rio Grande do Sul");
        meuMap.put("RO", "Rondônia");
        meuMap.put("RR", "Roraima");
        meuMap.put("SC", "Santa Catarina");
        meuMap.put("SP", "São Paulo");
        meuMap.put("SE", "Sergipe");
        meuMap.put("TO", "Tocantins");

        // Remove o estado de Minas Gerais
        meuMap.remove("MG");
        System.out.println(meuMap);

        // Adiciona o Distrito Federal
        meuMap.put("DF", "Distrito Federal");

        // Verifica o tamanho do mapa
        System.out.println(meuMap.size());

        // Remove Mato Grosso do Sul usando o nome
        String chaveARemover = null;
        for (String k: meuMap.keySet()) {
            if ("Mato Grosso do Sul".equals(meuMap.get(k))) {
                chaveARemover = k;
            }
        }
        meuMap.remove(chaveARemover);
        System.out.println(meuMap);

        // Navega nos elementos do mapa e mostra de forma formatada
        for (String k: meuMap.keySet()) {
            System.out.printf("%s (%s)\n", meuMap.get(k), k);
        }

        // Verifica se Santa Catarina está no mapa utilizando a chave SC
        System.out.println(meuMap.containsKey("SC"));

        // Verifica se Maranhão está no mapa utilizando o valor
        System.out.println(meuMap.containsValue("Maranhão"));

    }

}
