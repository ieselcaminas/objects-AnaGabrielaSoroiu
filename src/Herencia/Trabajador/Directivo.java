package Herencia.Trabajador;

public class Directivo extends Empleado {
    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public void presentarse(){
        System.out.println("Soy el directivo "+ getNombre());
    }


}
