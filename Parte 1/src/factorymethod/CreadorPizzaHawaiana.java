package src.factorymethod;

public class CreadorPizzaHawaiana implements CreadorPizza {

    @Override
    public Pizza crear() {
        return new PizzaHawaiana();
    }
}
