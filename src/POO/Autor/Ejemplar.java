package POO.Autor;

import java.util.ArrayList;
import java.util.List;

public class Ejemplar {
    private int n_reg;
    private String nombre;
    private Libro libro;
    private Lector lector;
    private List<Lector> lectores;

    public Ejemplar(int n_reg, String nombre, Libro libro, Lector lector) {
        this.n_reg = n_reg;
        this.nombre = nombre;
        this.libro = libro;
        this.lector = lector;
        this.lectores = new ArrayList<>();
    }

    public int getN_reg() {
        return n_reg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public List<Lector> getLectores() {
        return lectores;
    }

    public void addLector(Lector lector) {
        this.lectores.add(lector);
    }

    @Override
    public String toString() {
        return "Ejemplar: " + this.nombre;
    }
}
