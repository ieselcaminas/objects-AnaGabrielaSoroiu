package POO.Facultad;

import java.util.ArrayList;
import java.util.List;

public class AreaConocimiento {
    private int num_ac;
    private String nombre;
    private List<Departamento> departamentos;

    public AreaConocimiento(int num_ac, String nombre) {
        this.num_ac = num_ac;
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public int getNum_ac() {
        return num_ac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepartamentos(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    @Override
    public String toString() {
        return "Area Conocimiento: " + this.num_ac + " - " + this.nombre;
    }
}
