package POO.Autor;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private int cod_ed;
    private String nombre;
    private List<Libro> libros;

    public Editorial(int cod_ed, String nombre) {
        this.cod_ed = cod_ed;
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public int getCod_ed() {
        return cod_ed;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return "Editorial: " + this.nombre;
    }
}
