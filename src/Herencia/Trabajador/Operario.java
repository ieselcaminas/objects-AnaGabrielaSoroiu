package Herencia.Trabajador;

public abstract class Operario {
    public Operario (String nombre) {
        super(nombre);
    }

    @Override
    public void presentarse(){
        System.out.println("Soy un operario "+ getNombre());
    }

    public abstract void funcion();
}
