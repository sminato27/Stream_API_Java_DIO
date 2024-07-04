package functional_interface;

/*
* Representa uma função que aceita um argumento do tipo T (qualquer tipo) e retorna um resultado do tipo R.
* É utilizada para transformar ou mapear os elementos do Stream em outros valores, ou tipos.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Cria lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar a Function com expresão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = dobrar = numero -> numero * 2;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n ->  n * 2)
                .toList();

        numerosDobrados.forEach(System.out::println);
    }
}