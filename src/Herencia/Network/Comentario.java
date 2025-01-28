package Herencia.Network;

public class Comentario {
    private String comentario;
    private Usuario usuario;
    private Publicacion publicacion;

    public Comentario(String comentario, Usuario usuario, Publicacion publicacion) {
        this.comentario = comentario;
        this.usuario = usuario;
        this.publicacion = publicacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return this.comentario + " " + this.usuario + " " + this.publicacion;
    }
}
