package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    /*public static void main(String[] args) {
        // Criar uma lista
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Usar o Predicate com uma filtrar palavras com mais de 5 letras
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }
     */

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        //Quero usar um filter para filtrar palavras com mais de cinco letras
        palavras.stream()
                .filter(p -> p.length() < 3)
                .forEach(System.out::println);
    }
}