package POO.Facultad;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int num_d;
    private String nombre;
    private AreaConocimiento areaConocimiento;
    private List<Catedra> catedras;
    private List<Profesor> profesores;

    public Departamento(int num_d, String nombre, AreaConocimiento areaConocimiento) {
        this.num_d = num_d;
        this.nombre = nombre;
        this.areaConocimiento = areaConocimiento;
        this.catedras = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public int getNum_d() {
        return num_d;
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

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void addProfesor (Profesor profesor) {
        this.profesores.add(profesor);
    }

    @Override
    public String toString() {
        return "Departamento: " + this.num_d + " - " + this.nombre;
    }
}
