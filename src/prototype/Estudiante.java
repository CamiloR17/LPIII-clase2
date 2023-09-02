package src.prototype;

public class Estudiante {
    private String nombre;
    private Long id;
    private int creditos;

    public Estudiante(String nombre, Long id, int creditos) {
        this.nombre = nombre;
        this.id = id;
        this.creditos = creditos;
    }

    public Estudiante(Estudiante estudiante) {
        this.nombre = estudiante.nombre;
        this.id = estudiante.id;
        this.creditos = estudiante.creditos;
    }

    @Override
    public Estudiante clone() {
        return new Estudiante(this);
    }
}
