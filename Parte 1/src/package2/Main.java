package src.package2;

import src.factorymethod.CreadorPizza;
import src.factorymethod.CreadorPizzaHawaiana;
import src.factorymethod.CreadorPizzaSalami;
import src.factorymethod.Pizza;

public class Main {

    public static void main(String[] args) {
        CreadorPizza creadorPizza = new CreadorPizzaSalami();
        Pizza pizza = crearPizza(creadorPizza);

        System.out.println(pizza);
    }

    public static Pizza crearPizza(CreadorPizza creadorPizza) {
        return creadorPizza.crear();
    }
}
