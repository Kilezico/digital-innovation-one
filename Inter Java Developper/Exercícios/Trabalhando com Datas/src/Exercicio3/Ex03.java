package Exercicio3;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex03 {

    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");

        String dataFormatada = formatador.format(agora);
        System.out.println(dataFormatada);

    }
}
