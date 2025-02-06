package POO.Autor;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String dni;
    private String nombre;
    private List<Ejemplar> ejemplares;

    public Lector(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.ejemplares = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void addEjemplar(Ejemplar ejemplar) {
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString() {
        return "Lector: " + this.nombre;
    }
}
