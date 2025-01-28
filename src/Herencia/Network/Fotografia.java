package Herencia.Network;

public class Fotografia extends Publicacion {
    private String nombreFotografia;
    private String archivo;

    public Fotografia(Usuario usuario, String nombreFotografia, String archivo) {
        super(usuario);
        this.nombreFotografia = nombreFotografia;
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return this.getFecha() + " | " + getUsuario() + ": " + this.nombreFotografia + " - " +
                this.archivo + "| Likes: " + this.getLike();
    }
}
