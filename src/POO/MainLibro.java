package POO;

public class MainLibro {
    public static void main(String[] args) {
        Autor Juan = new Autor("Juan", "2005-08-11");
        Tema ficcion = new Tema("Ficcion");

        Libro a = new Libro("1", Juan, 300, ficcion);
    }
}
