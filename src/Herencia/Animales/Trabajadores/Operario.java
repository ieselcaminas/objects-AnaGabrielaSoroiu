package Herencia.Animales.Trabajadores;

public abstract class Operario extends Empleado {
    public Operario (String nombre) {
        super(nombre);
    }

    @Override
    public void presentarse(){
        System.out.println("Soy un operario "+ getNombre());
    }

    public abstract void funcion();


}
