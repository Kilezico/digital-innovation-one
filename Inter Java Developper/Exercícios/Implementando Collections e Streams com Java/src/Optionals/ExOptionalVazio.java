package Optionals;

import java.util.Optional;

public class ExOptionalVazio {

    public static void main(String[] args) {

        // Cria Optional de tipo String
        Optional<String> meuOptional = Optional.empty();

        // Exibe o valor, se presente
        meuOptional.ifPresent(System.out::println);

        // Lança exceção, se vazio
        try {
            meuOptional.orElseThrow(IllegalStateException::new);
        } catch (IllegalStateException e) {
            System.out.println("\033[31mjava.lang.IllegalStateException!\033[m");
        }

        // Exibe mensagem no console, se vazio; transforma o valor, se presente
        if (meuOptional.isEmpty()) {
            System.out.println("Optional vazio");
        } else {
            meuOptional.map((valor) -> "*" + valor + "* TRANSFORMADO").ifPresent(System.out::println);
        }

        // Atribui valor a variável, se presente
        if (meuOptional.isPresent()) {
            String textoOptional = meuOptional.get();
            System.out.println("Valor da variável: " + textoOptional);
        }

        // Filtra o optional com regra de negócio, se presente
        meuOptional.ifPresent((valor) -> System.out.println("--> " + valor));


    }

}
