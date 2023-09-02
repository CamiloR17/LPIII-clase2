package src.strategy;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class AccionCrear implements Accion{
    private Map map;
    @Override
    public void aplicar() {
        System.out.println("Estoy creando");


    }

    @Override
    public int getOpcion() {
        return 1;
    }
}
