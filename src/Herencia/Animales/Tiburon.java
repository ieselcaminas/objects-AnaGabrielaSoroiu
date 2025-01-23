package Herencia.Animales;

public class Tiburon extends Pez {
    public Tiburon(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println("Me comunico con las aletas.");
    }

}
