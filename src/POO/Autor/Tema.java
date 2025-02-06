package POO.Autor;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private int cod_t;
    private String nombre;
    private List<Libro> libros;

    public Tema(int cod_t, String nombre) {
        this.cod_t = cod_t;
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public int getCod_t() {
        return cod_t;
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

    public void addLibro(Libro libros) {
        this.libros.add(libros);
    }
}
