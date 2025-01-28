package Herencia.Network;

import java.util.Date;

public abstract class Publicacion {
    private Usuario usuario;
    private Date fecha;
    private int like;

    public Publicacion(Usuario usuario) {
        this.usuario = usuario;
        this.fecha = new Date();
        this.like = 0;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getLike() {
        return like;
    }

    public void darLike() {
        this.like++;
    }

    public void darDislike() {
        this.like--;
    }
}
