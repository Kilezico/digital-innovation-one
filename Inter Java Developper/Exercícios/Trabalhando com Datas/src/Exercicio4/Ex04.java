package Exercicio4;

import java.time.LocalDateTime;

public class Ex04 {

    public static void main(String[] args) {

        // Momento atual: 15/05/2010 10:00:00
        LocalDateTime momentoInicial = LocalDateTime.of(2010, 05, 15, 10, 0, 0);

        // Adiciona 4 anos, 6 meses e 13 horas
        LocalDateTime momentoFinal = momentoInicial.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println("Momento Inicial: " + momentoInicial);

        System.out.println("Momento Final: " + momentoFinal);
    }
}
