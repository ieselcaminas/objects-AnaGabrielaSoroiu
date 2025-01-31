package POO.Banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String dni;
    private String nombre;
    private List<Prestamo> prestamos;
    private List<CuentaCorriente> cuentasCorrientes;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
        this.cuentasCorrientes = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public List<CuentaCorriente> getCuentasCorrientes() {
        return cuentasCorrientes;
    }

    public void addCuentaCorriente(CuentaCorriente cuentaCorriente) {
        cuentasCorrientes.add(cuentaCorriente);
    }

    @Override
    public String toString() {
        return this.dni + " - " + this.nombre;
    }
}
