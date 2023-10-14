package generics;

public class Calculadora {

    public static <T extends Juguete> Integer suma(T parametro1, T parametro2) {
        return parametro1.getId() + parametro2.getId();
    }

}
