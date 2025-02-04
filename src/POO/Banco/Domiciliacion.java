package POO.Banco;

import POO.Cuenta.Cuenta;

public class Domiciliacion {
    private int num_d;
    private String concept;
    private CuentaCorriente cuentaCorriente;

    public Domiciliacion(int num_d, String concept, CuentaCorriente cuentaCorriente) {
        this.num_d = num_d;
        this.concept = concept;
        this.cuentaCorriente = cuentaCorriente;
    }

    public int getNum_d() {
        return num_d;
    }


    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public String toString() {
        return "Domiciliación: " + this.num_d + " - " + this.concept;
    }
}
