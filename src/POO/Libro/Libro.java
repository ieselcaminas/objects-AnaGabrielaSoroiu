package POO.Libro;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private List<Tema> tema;

    public Libro(String titulo, Autor autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.tema = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public List<Tema> getTema() {
        return tema;
    }

    public void addTema (Tema tema) {
        this.tema.add(tema);
    }

    @Override
    public String toString() {
        return this.titulo + " " + this.autor.getNombre() + " " + this.paginas;
    }
}
