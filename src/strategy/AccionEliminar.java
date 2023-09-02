package src.strategy;

public class AccionEliminar implements Accion{
    @Override
    public void aplicar() {
        System.out.println("Estoy eliminando");
    }

    @Override
    public int getOpcion() {
        return 4;
    }
}
