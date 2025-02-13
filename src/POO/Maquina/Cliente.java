package POO.Maquina;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private double dinero;
    private int cod_cli;
    private List<Ticket> tiquets;

    public Cliente(String nombre, double dinero, int cod_cli) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.cod_cli = cod_cli;
        this.tiquets = new ArrayList<Ticket>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public int getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(int cod_cli) {
        this.cod_cli = cod_cli;
    }

    public List<Ticket> getTiquets() {
        return tiquets;
    }

    public void addTiquets(Ticket ticket) {
        if (this.dinero == ticket.getPrecio()) {
            this.tiquets.add(ticket);
        } else if (this.dinero > ticket.getPrecio()) {
            this.tiquets.add(ticket);
            this.dinero -= ticket.getPrecio();
        } else {
            System.out.println("Introduzca el importe exacto.");
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nombre;
    }
}
