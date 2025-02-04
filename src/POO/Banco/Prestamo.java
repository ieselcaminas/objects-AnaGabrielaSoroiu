package POO.Banco;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private int num_p;
    private double cantidad;
    private Cliente cliente;

    public Prestamo(int num_p, double cantidad, Cliente cliente) {
        this.num_p = num_p;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Prestamo: " + this.num_p + " - " + this.cantidad;
    }
}
