package generics;

public class Carrito implements Juguete, Cosa {

    public Carrito() {
        System.out.println("Estoy creando un carrito");
    }

    @Override
    public Integer getId() {
        return 2;
    }
}
