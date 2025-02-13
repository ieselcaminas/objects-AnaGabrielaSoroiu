package POO.Maquina;

public class Cajon {
    private int cod_c;
    private MaquinaExpendedora maquinaExpendedora;

    public Cajon(int cod_c, MaquinaExpendedora maquinaExpendedora) {
        this.cod_c = cod_c;
        this.maquinaExpendedora = maquinaExpendedora;
    }

    public int getCod_c() {
        return cod_c;
    }
    public MaquinaExpendedora getMaquinaExpendedora() {
        return maquinaExpendedora;
    }

    public void setMaquinaExpendedora(MaquinaExpendedora maquinaExpendedora) {
        this.maquinaExpendedora = maquinaExpendedora;
    }

    @Override
    public String toString() {
        return "Cajón: " + this.maquinaExpendedora;
    }
}
