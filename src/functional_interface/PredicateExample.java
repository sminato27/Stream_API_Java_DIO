package functional_interface;

/*
* Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.
* É comumente usada para filtrar os elementos do Stream com base em alguma condição.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Criar lista de palavras
        List<String> palavras = Arrays.asList("Java", "Programação", "Métodos", "Android", "UI");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caractéres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        /* Usar o Stream para filtrar as palavras com mais de 5 caractéres e em seguida, imprimir cada palavra que
        passou no filtro.
         */
        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);

    }
}