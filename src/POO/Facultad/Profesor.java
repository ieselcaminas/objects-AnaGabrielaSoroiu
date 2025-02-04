package POO.Facultad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private int num_p;
    private String nombre;
    private Departamento departamento;
    private List<Catedra> catedras;

    public Profesor(int num_p, String nombre, Departamento departamento) {
        this.num_p = num_p;
        this.nombre = nombre;
        this.departamento = departamento;
        this.catedras = new ArrayList<>();
    }

    public int getNum_p() {
        return num_p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void addCatedra(Catedra catedra) {
        this.catedras.add(catedra);
    }

    @Override
    public String toString() {
        return "Profesor: " + this.num_p + " - " + this.nombre;
    }
}
