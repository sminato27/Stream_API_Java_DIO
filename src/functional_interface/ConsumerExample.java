package functional_interface;

/*
* Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
* É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar, ou retornar um valor.
*/


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar o Consumer com expressão lambda para imprimir os números pares
        Consumer<Integer> imprimirNumerosPares = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir os números pares no Stream
        numeros.stream().forEach(imprimirNumerosPares);

        // Forma resumida de usar o Consumer para imprimir os números pares no Stream
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
