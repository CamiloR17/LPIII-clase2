package generics;

public abstract class Creador<T extends Juguete> {

    public abstract T crear();

    public void cualquierMetodo(T juguete) {
        juguete.getId();
    }
}
