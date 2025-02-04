package POO.Banco;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int n_suc;
    private String localizacion;
    private Banco banco;
    private List<CuentaCorriente> cuentasCorrientes;
    private List<Prestamo> prestamos;

    public Sucursal(int n_suc, String localizacion, Banco banco) {
        this.n_suc = n_suc;
        this.localizacion = localizacion;
        this.banco = banco;
        this.cuentasCorrientes = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public int getN_suc() {
        return n_suc;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public List<CuentaCorriente> getCuentasCorrientes() {
        return cuentasCorrientes;
    }

    public void addCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentasCorrientes.add(cuentaCorriente);
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return "Sucursal: " + this.n_suc + " - " + this.localizacion;
    }
}
