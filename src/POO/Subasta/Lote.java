package POO.Subasta;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int numero;
    private double precioSalida;
    private Subasta subasta;
    private List<Articulo> articulos;
    private List<Pujador> pujadores;
    private List<Puja> pujas;

    public Lote(int numero, double precioSalida, Subasta subasta) {
        this.numero = numero;
        this.precioSalida = precioSalida;
        this.subasta = subasta;
        this.articulos = new ArrayList<>();
        this.pujadores = new ArrayList<>();
        this.pujas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public List<Pujador> getPujadores() {
        return pujadores;
    }

    public void addPujador(Pujador pujador) {
        this.pujadores.add(pujador);
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void addPuja(Puja puja) {
        this.pujas.add(puja);
    }

    @Override
    public String toString() {
        return "Lote - " + this.numero + " | Precio de Salida: " + this.precioSalida + " | Subasta: " + this.subasta;
    }
}
