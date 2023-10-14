package streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1L, 20, "Andres"));
        empleados.add(new Empleado(6L, 18, "Fernando"));
        empleados.add(new Empleado(8L, 17, "Andrey"));

        // Recordar lazy y el Eager, el lazy es el que áun no se á ejecutado, solo cuando se usa. -> singleton

//        Set<Character> iniciales = empleados.stream()
//                .map(empleado -> empleado.getNombre())
//                .map(nombre -> nombre.charAt(0))
//                .collect(Collectors.toSet());

//        Set<Empleado> empleadosfilter = empleados.stream()
//                .filter(empleado -> empleado.getEdad() > 18) // empleado.getNombre().charAt(0) != 'A'
//                .collect(Collectors.toSet());

//        Optional<Empleado> empleado1 = empleados.stream()
//                .max(Comparator.comparing(empleado -> empleado.getId())); // .min(Comparator.comparing(empleado -> empleado.getEdad()));

//        Optional<Empleado> empleado1 = empleados.stream()
//                .filter(empleado -> empleado.getNombre().charAt(0) == 'A')
//                .findFirst(); // findAny -> encontrar cualquiera.

//   intermedia => Stream<T>       Terminal => Collect or Optional.

//        Map<Long, Empleado> empleado1 = empleados.stream()
//                .collect(Collectors.toMap(empleado -> empleado.getId(), empleado -> empleado));

//        empleados.stream()
//                .map(Empleado::getId)
//                .forEach(System.out::println);

//        System.out.println(empleado1);
//        System.out.println(empleados);

        Optional<Empleado> empleadoOptional =
                Optional.of(new Empleado(5L, 10, "Alan Brito"))
                        .filter(empleado -> empleado.getEdad() > 18);

        empleadoOptional.orElse(null); // remplaza el .get() para no dejar que surja el NullPointerException // Eager

        empleadoOptional.orElseGet(() -> new Empleado(4L, 25, "Sebastian")); // Lazy

        System.out.println(empleadoOptional);
    }
}
