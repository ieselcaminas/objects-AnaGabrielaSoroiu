package Herencia.Animales;

public class Gato extends Mamifero {
    public Gato(String nombre) {
        super(nombre);
    }

    public void jugarOvillo() {
        System.out.println("Mira como juego con un ovillo.");
    }

    @Override
    public void comunicarse() {
        System.out.println("miau");
    }
}
