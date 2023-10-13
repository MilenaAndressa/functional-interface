package opitional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String resultado = optionalValue.orElse("Default");
        System.out.println(resultado);
    }
}
