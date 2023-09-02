package src.strategy;

public class AccionActualizar implements Accion{
    @Override
    public void aplicar() {
        System.out.println("Estoy actualizando");
    }

    @Override
    public int getOpcion() {
        return 3;
    }
}
