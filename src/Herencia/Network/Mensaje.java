package Herencia.Network;

import java.util.ArrayList;

public class Mensaje extends Publicacion {
    private int id;
    private String texto;

    public Mensaje(Usuario usuario, int id, String texto) {
        super(usuario);
        this.id = id;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.getFecha() + " | " + this.id + " - " + getUsuario() + ": " + this.texto
                + "| Likes: " + this.getLike();
    }
}
