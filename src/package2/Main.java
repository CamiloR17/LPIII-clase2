package src.package2;

import src.builder.Empleado;
import src.factorymethod.CreadorPizza;
import src.factorymethod.CreadorPizzaHawaiana;
import src.factorymethod.CreadorPizzaSalami;
import src.factorymethod.Pizza;
import src.prototype.Estudiante;

public class Main {

    public static void main(String[] args) {
        /*
        Empleado empleado = Empleado.builder()
                .id(123L)
                .nombre("Jorge")
                .build();
        System.out.println(empleado);
        */

        /*
        Estudiante estudiante = new Estudiante("Camilo", 7656L, 9);
        Estudiante estudiante2 = estudiante.clone();

        System.out.println(estudiante2 == estudiante);
        */

        CreadorPizza creadorPizza = new CreadorPizzaSalami();
        Pizza pizza = crearPizza(creadorPizza);

        System.out.println(pizza.getTipoMasa() + " " + pizza.getTipoQueso() + " " + pizza.getToppings());
    }

    public static Pizza crearPizza(CreadorPizza creadorPizza) {
        return creadorPizza.crear();
    }
}
