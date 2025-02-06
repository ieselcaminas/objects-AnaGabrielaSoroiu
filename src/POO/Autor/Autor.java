package POO.Autor;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private int cod_aut;
    private String nombre;
    private List<Libro> libros;

    public Autor(int cod_aut, String nombre) {
        this.cod_aut = cod_aut;
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public int getCod_aut() {
        return cod_aut;
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
        return "Autor: " + this.nombre;
    }
}
