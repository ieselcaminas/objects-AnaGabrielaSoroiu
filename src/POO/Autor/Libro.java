package POO.Autor;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private int isbn;
    private String titulo;
    private Editorial editorial;
    private Tema tema;
    private List<Ejemplar> ejemplares;
    private List<Autor> autores;

    public Libro(int isbn, String titulo, Editorial editorial, Tema tema) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.tema = tema;
        this.ejemplares = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void addEjemplar(Ejemplar ejemplar) {
        this.ejemplares.add(ejemplar);
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }

    @Override
    public String toString() {
        return "Libro: " + this.isbn;
    }
}
