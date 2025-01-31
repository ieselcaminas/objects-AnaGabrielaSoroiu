package POO.Banco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Banco> bancos = new ArrayList<>();

        Banco cajamar = new Banco(1, "Cajamar" );
        bancos.add(cajamar);

            Sucursal sucursalCajamar = new Sucursal(1, "Castellon", cajamar);
            cajamar.addSucursal(sucursalCajamar);

            Sucursal sucursalCajamar2 = new Sucursal(2, "Valencia", cajamar);
            cajamar.addSucursal(sucursalCajamar2);

            Cliente paquito = new Cliente("1234", "Paquito");
                Prestamo prestamoPaco = new Prestamo(1, 50.5, paquito);
                paquito.addPrestamo(prestamoPaco);
                sucursalCajamar.getPrestamos().add(prestamoPaco);

            CuentaCorriente cuentaPaquito = new CuentaCorriente(1, "owner");
                paquito.addCuentaCorriente(cuentaPaquito);
                sucursalCajamar.getCuentasCorrientes().add(cuentaPaquito);
                cuentaPaquito.addCliente(paquito);

        Banco santander = new Banco(2, "Santander");
        bancos.add(santander);

        for (Banco b : bancos) {
            System.out.println(b);
            for(Sucursal s : b.getSucursales()) {
                System.out.println("\t" + s);
                for (CuentaCorriente cc : s.getCuentasCorrientes()) {
                    System.out.println("\t\t" + cc);
                    for(Cliente c: cc.getClientes()) {
                        System.out.println("\t\t\t" + c);
                        for(Prestamo p: c.getPrestamos()) {
                            System.out.println("\t\t\t\t" + p);
                        }
                    }
                }
            }
        }
    }
}
