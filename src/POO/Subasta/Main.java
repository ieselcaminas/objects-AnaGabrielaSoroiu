package POO.Subasta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Subasta> subastas = new ArrayList<>();

        Subasta subasta1 = new Subasta("15 de Febrero");
        subastas.add(subasta1);

            Lote lote1 = new Lote(1, 2500, subasta1);
                Articulo estatua = new Articulo("Estatua", 1000, lote1);
                Articulo cuadro = new Articulo("Cuadro", 1400, lote1);
                lote1.addArticulo(cuadro);
                lote1.addArticulo(estatua);

            Lote lote2 = new Lote(2, 450, subasta1);
                Articulo jarron = new Articulo("Jarron", 500, lote2);
                Articulo leon = new Articulo("Cabeza de leon", 890, lote2);
                lote2.addArticulo(leon);
                lote2.addArticulo(jarron);

            Pujador manuela = new Pujador("Manuela");

            Puja puja1 = new Puja(lote1, manuela, 600);
            lote1.addPuja(puja1);
            manuela.addPuja(puja1);

        Subasta subasta2 = new Subasta("1 de Marzo");
        subastas.add(subasta2);
    }
}
