package generics;

public class Peluche implements Juguete, Cosa {

    public Peluche() {
        System.out.println("Estoy creando un peluche");
    }

    @Override
    public Integer getId() {
        return 1;
    }
}
