package POO.Subasta;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private String dia;
    private List<Lote> lotes;

    public Subasta(String dia) {
        this.dia = dia;
        this.lotes = new ArrayList<>();
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void addLote(Lote lote) {
        this.lotes.add(lote);
    }

    @Override
    public String toString() {
        return "Subasta el día: " + this.dia;
    }
}
