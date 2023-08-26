package src.package2;

import src.builder.Empleado;

public class Main {

    public static void main(String[] args) {
        Empleado empleado = Empleado.builder()
                .id(123L)
                .nombre("Jorge")
                .build();
        System.out.println(empleado);
    }
}
