package POO.Banco;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente {
    private int n_cc;
    private String privilegio;
    private List<Cliente> clientes;
    private List<Domiciliacion> domiciliaciones;

    public CuentaCorriente(int n_cc, String privilegio) {
        this.n_cc = n_cc;
        this.privilegio = privilegio;
        this.clientes = new ArrayList<>();
        this.domiciliaciones = new ArrayList<>();
    }

    public int getN_cc() {
        return n_cc;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void addDomiciliacion(Domiciliacion domiciliacion) {
        this.domiciliaciones.add(domiciliacion);
    }

    @Override
    public String toString() {
        return "Cuenta Corriente: " + this.n_cc + " - " + this.privilegio;
    }
}
