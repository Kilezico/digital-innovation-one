package Exercicio2;

import java.util.Calendar;

public class Ex02 {

    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();
        System.out.printf("Hoje é: %tF\n", hoje);

        Calendar vencimento = Calendar.getInstance();
        // Data de vencimento: 13/02/21
        vencimento.set(Calendar.DATE, 14);
        System.out.printf("Data de vencimento: %tF\n", vencimento);

        int diaDaSemana = vencimento.get(Calendar.DAY_OF_WEEK);
        if (diaDaSemana == 7) {
            vencimento.add(Calendar.DATE, 2);
            System.out.printf("Data real de vencimento: %tF\n", vencimento);
        } else if (diaDaSemana == 1) {
            vencimento.add(Calendar.DATE, 1);
            System.out.printf("Data real de vencimento: %tF\n", vencimento);
        }

        int diasAnoVencimento = vencimento.get(Calendar.DAY_OF_YEAR);
        int diasAnoHoje = hoje.get(Calendar.DAY_OF_YEAR);
        int restante = diasAnoVencimento - diasAnoHoje;
        System.out.println("Ainda faltam " + restante + " dias para pagar.");


    }
}
