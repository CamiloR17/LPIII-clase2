package streams;

public class Empleado {

    private Long id;
    private int edad;
    private String nombre;

    public Empleado(Long id, int edad, String nombre) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
    }


    public Long getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
