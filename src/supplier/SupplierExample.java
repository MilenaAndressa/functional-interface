package supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    /*public static void main(String[] args) {
        //Usar o Supplier com expressão lambda para fornecer uma saudação personalizada

        //Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        //Lista com cinco saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }*/

    public static void main(String[] args) {
        //Imprimir uma sequência de saudações
        List<String> listaDeSaudacoes = Stream.generate(() -> "Olá, mundo!")
                .limit(3)
                .toList();

        listaDeSaudacoes.forEach(System.out::println);
    }
}
