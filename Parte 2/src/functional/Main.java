package functional;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<Integer, String> function = (Integer integer) -> integer.toString() + ", este es el número";
        String string = function.apply(8);
        MiInterfazFuncional<String, Integer> miInterfazFuncional = stringParam -> {
            System.out.println("Valor de entrada" + stringParam);
            return 50;
        };
        System.out.println(miInterfazFuncional.aplicar("100"));
    }
}
