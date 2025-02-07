package POO.Autor;

public class Historico {
    private String fecha_p;
    private String fecha_d;
    private Ejemplar ejemplar;
    private Lector lector;

    public Historico(String fecha_p, String fecha_d, Ejemplar ejemplar, Lector lector) {
        this.fecha_p = fecha_p;
        this.fecha_d = fecha_d;
        this.ejemplar = ejemplar;
        this.lector = lector;
    }

    public String getFecha_p() {
        return fecha_p;
    }

    public String getFecha_d() {
        return fecha_d;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public Lector getLector() {
        return lector;
    }
}
