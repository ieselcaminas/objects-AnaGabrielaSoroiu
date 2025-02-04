package POO.Facultad;

import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private int num_c;
    private String nombre;
    private Departamento departamento;
    private Facultad facultad;
    private List<Profesor> profesores;

    public Catedra(int num_c, String nombre, Departamento departamento, Facultad facultad) {
        this.num_c = num_c;
        this.nombre = nombre;
        this.departamento = departamento;
        this.facultad = facultad;
        this.profesores = new ArrayList<>();
    }

    public int getNum_c() {
        return num_c;
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

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void addProfesor (Profesor profesor) {
        this.profesores.add(profesor);
    }

    @Override
    public String toString() {
        return "Catedra: " + this.num_c + " - " + this.nombre;
    }
}
