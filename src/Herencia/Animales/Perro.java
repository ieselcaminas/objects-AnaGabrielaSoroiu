package Herencia.Animales;

public class Perro extends Mamifero {
    public Perro (String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println("guau");
    }

    public void traerZapatillas(){
        System.out.println("Toma la zapatilla.");
    }
}
