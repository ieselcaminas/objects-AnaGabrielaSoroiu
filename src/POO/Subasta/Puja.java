package POO.Subasta;

public class Puja implements Comparable<Puja> {
    private Lote lote;
    private Pujador pujador;
    private double precio;

    public Puja(Lote lote, Pujador pujador, double precio) {
        this.lote = lote;
        this.pujador = pujador;
        this.precio = precio;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Puja: " + this.precio;
    }

    @Override
    public int compareTo(Puja other) {
        if (this.precio > other.getPrecio()) {
            return Double.compare(this.precio, other.getPrecio());
        } else {
            return Double.compare(other.precio, this.getPrecio());
        }
    }
}
