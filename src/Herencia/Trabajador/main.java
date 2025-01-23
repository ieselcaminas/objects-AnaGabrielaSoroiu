package Herencia.Trabajador;


public class main {
    public static void main(String[] args) {
        Directivo directivo = new Directivo("Manuela");
        directivo.presentarse();
        System.out.println(" ");

        Oficial oficial = new Oficial("Jose");
        oficial.presentarse();
        oficial.funcion();
        System.out.println(" ");

        Tecnico tecnico = new Tecnico("Gabi");
        tecnico.presentarse();
        tecnico.funcion();
    }
}
