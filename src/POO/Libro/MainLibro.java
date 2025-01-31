package POO.Libro;

import java.util.ArrayList;
import java.util.List;

public class MainLibro {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        Autor Juan = new Autor("Juan", "2005-08-11");

        Libro a = new Libro("Hola", Juan, 300);

        a.addTema(new Tema("Terror"));
        a.addTema(new Tema("Fantasy"));

        libros.add(a);

        for(Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
            for (Tema temas: libro.getTema()) {
                System.out.println(temas);
            }
        }
    }
}
