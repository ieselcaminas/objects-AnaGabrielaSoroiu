package POO.Maquina;

public class MaquinaExpendedora {
    private int cod_e;

    public MaquinaExpendedora(int cod_e) {
        this.cod_e = cod_e;
    }

    public int getCod_e() {
        return cod_e;
    }

    @Override
    public String toString() {
        return "MaquinaExpendedora: " + this.cod_e;
    }
}
