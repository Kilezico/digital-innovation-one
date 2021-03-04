package Exercicio1;

import java.util.Date;

public class Ex01 {

    public static void main(String[] args) {

        //timeInMillis do dia em que nasci
        long nascimentoMillis = 1111287600000L;

        // timeInMillis do dia para comparação
        long comparaMillis = 1273892400000L;

        Date nascimento = new Date(nascimentoMillis);
        System.out.printf("Data do seu nascimento:\n%s\n\n", nascimento);

        Date compara = new Date(comparaMillis);
        System.out.printf("Data para comparação:\n%s\n\n", compara);

        System.out.println("Comparação:");
        int resultado = nascimento.compareTo(compara);
        System.out.println(resultado);

        if (resultado > 0) {
            System.out.println("Você nasceu depois da data para comparação.");
        } else if (resultado < 0) {
            System.out.println("Você nasceu antes da data para comparação.");
        } else {
            System.out.println("Você nasceu na data para comparação.");
        }

    }
}
