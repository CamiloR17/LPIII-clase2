package src.builder;

public class Empleado {

    private String nombre;
    private long id;

    public Empleado(String nombre, Long id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }

    public static EmpleadoBuilder builder() {
        return new EmpleadoBuilder();
    }
    public static class EmpleadoBuilder {

        private String nombre;
        private long id;

        public EmpleadoBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EmpleadoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public Empleado build() {
            return new Empleado(nombre, id);
        }
    }


}
