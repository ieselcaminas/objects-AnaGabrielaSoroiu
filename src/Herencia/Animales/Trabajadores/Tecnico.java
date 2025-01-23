package Herencia.Animales.Trabajadores;

public class Tecnico extends Operario{
    public Tecnico (String nombre) {
        super(nombre);
    }

    @Override
    public void funcion() {
        System.out.println("Soy un oficial.");
    }
}
