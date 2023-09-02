package src.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static final int opcion_salir = 6;
    public static void main(String[] args) {
        Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        int opcion;
        do {
            System.out.println("Ingrese su opción");
            opcion = scanner.nextInt();
            scanner.nextLine();
            Accion accion = strategy.get(opcion);
            if (opcion == opcion_salir) { continue; }
            if (accion == null) {
                System.out.println("Esta opción no existe");
            }else {
                accion.aplicar();
            }
        }while (opcion != opcion_salir);
    }
}
