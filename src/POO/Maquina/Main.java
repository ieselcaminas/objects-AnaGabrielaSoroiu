package POO.Maquina;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MaquinaExpendedora> maquinas = new ArrayList<>();
        List<Cajon> cajones = new ArrayList<>();

        MaquinaExpendedora maquina1 = new MaquinaExpendedora(1);
            maquinas.add(maquina1);

            Cajon cajon1 = new Cajon(1, maquina1);
            cajones.add(cajon1);

            Cliente maria = new Cliente("Maria", 0.20, 1);

            Ticket bus = new Ticket(1, 1.20, maria);
            maria.addTiquets(bus);


        System.out.println(maria.getTiquets() + "\n Te devuelven: " + maria.getDinero() + "€");

    }
}
