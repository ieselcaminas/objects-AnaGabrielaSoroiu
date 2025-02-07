package POO.Autor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Editorial> editoriales = new ArrayList<>();
        List<Tema> temas = new ArrayList<>();
        List<Lector> lectores = new ArrayList<>();

        Tema fantasia = new Tema(1, "Fantasía");
        temas.add(fantasia);

        Lector marta = new Lector("111e", "Marta");
        lectores.add(marta);

        Lector david = new Lector("222f", "David");
        lectores.add(david);

        Editorial mirahadas = new Editorial(1, "Mirahadas");
            Libro harryPotter = new Libro(1111111, "Harry Potter", mirahadas, fantasia);
                Autor jk = new Autor(1, "J.K. Rowling");
                harryPotter.addAutor(jk);
                mirahadas.addLibro(harryPotter);

            Libro anillos = new Libro(2222222, "El señor de los anillos", mirahadas, fantasia);
                Autor jrr = new Autor(2, "J.R.R. Tolkien");
                anillos.addAutor(jrr);
                mirahadas.addLibro(anillos);

                Ejemplar anillos1 = new Ejemplar(1, "El señor de los anillos", anillos, marta);
                anillos.addEjemplar(anillos1);
                anillos1.addLector(marta);

                Ejemplar anillos2 = new Ejemplar(1, "El señor de los anillos", anillos, david);
                anillos.addEjemplar(anillos2);
                anillos2.addLector(david);

                marta.addEjemplar(anillos1);
                david.addEjemplar(anillos2);

            fantasia.addLibro(anillos);
            fantasia.addLibro(harryPotter);

            Historico historico = new Historico("hoy", "mañana", anillos1, david);

        Editorial sextoPiso = new Editorial(2, "Sexto Piso");

        editoriales.add(mirahadas);
        editoriales.add(sextoPiso);

        for (Tema tem : temas) {
            System.out.println(tem.getNombre());
        }

        System.out.println("----");

        for (Editorial ed : editoriales) {
            System.out.println(ed.getNombre());

            for (Libro lib : ed.getLibros()) {
                System.out.println("\t" + lib.getTitulo());

                for (Autor a : lib.getAutores()) {
                    System.out.println("\t\t" + a.getNombre());
                }
            }
        }

        System.out.println("----");

        for (Lector lec : lectores) {
            System.out.println(lec.getNombre());

            for (Ejemplar ej : lec.getEjemplares()) {
                System.out.println("\t" + ej.getNombre());
            }
        }
    }
}
