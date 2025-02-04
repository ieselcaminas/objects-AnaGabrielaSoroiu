package POO.Facultad;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private int num_f;
    private String nombre;
    private List<Catedra> catedras;

    public Facultad(int num_f, String nombre) {
        this.num_f = num_f;
        this.nombre = nombre;
        this.catedras = new ArrayList<>();
    }

    public int getNum_f() {
        return num_f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void addCatedra (Catedra catedra) {
        this.catedras.add(catedra);
    }

    @Override
    public String toString() {
        return "Facultad: " + this.num_f + " - " + this.nombre;
    }
}
