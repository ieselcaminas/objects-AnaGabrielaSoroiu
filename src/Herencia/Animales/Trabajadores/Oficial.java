package Herencia.Animales.Trabajadores;

public class Oficial extends Operario{
    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public void funcion() {
        System.out.println("Soy un oficial.");
    }
}
