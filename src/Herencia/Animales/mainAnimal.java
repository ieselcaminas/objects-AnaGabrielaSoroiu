package Herencia.Animales;

public class mainAnimal {
    public static void main(String[] args) {
        //Faltan las interfaces
        Perro perro = new Perro("Nico");
        perro.comunicarse();
        perro.traerZapatillas();
        perro.respirar();
        perro.mamar();
        perro.moverse();

        Gato gato = new Gato("Paquito");
        gato.comunicarse();
        gato.jugarOvillo();
        gato.respirar();
        gato.mamar();
        gato.moverse();

        Tiburon tiburon = new Tiburon("Tiburon");
        tiburon.comunicarse();
        tiburon.respirar();
        tiburon.moverse();

        PezPayaso payaso = new PezPayaso("Pez Payaso");
        payaso.comunicarse();
        payaso.respirar();
        payaso.moverse();
    }
}
