package POO.Maquina;

public class Ticket {
    private int cod_t;
    private double precio;
    private Cliente cliente;

    public Ticket(int cod_t, double precio, Cliente cliente) {
        this.cod_t = cod_t;
        this.precio = precio;
        this.cliente = cliente;
    }

    public int getCod_t() {
        return cod_t;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Ticket: " + this.cod_t + " | Precio: " + this.precio;
    }
}
