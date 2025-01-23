package Herencia.Animales;

public abstract class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }
    @Override
    public void respirar() {
        System.out.println("Respiro por los pulmones.");
    }

    public void mamar() {
        System.out.println("Cuando soy pequeño mamo");
    }

    @Override
    public void moverse() {
        System.out.println("Me muevo a 4 patas.");
    }

}
