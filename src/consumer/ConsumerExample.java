package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    /*public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> imprimirNumerosPares = numero -> {
            //numero aqui representa cada elemento do stream
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };
        //transforma a lista em um stream para que possa utilizar o consumer
        numeros.stream().forEach(imprimirNumerosPares); //faz para cada elemento (forEach)
        //ou seja, ele irá executar o que está no lambda para cada elemento da Stream.
    }
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //O que eu quero?
        //Imprimir elementos pares dentro da lista, então eu vou utilizar o forEach()
        //Sabemos também que o forEach() recebe um Consumer

        numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .forEach(System.out::println);
    }
}