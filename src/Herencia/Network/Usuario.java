package Herencia.Network;

public class Usuario {
    private String login;
    private String nombre;
    private int id;

    public Usuario(String login, String nombre, int id) {
        this.login = login;
        this.nombre = nombre;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.login;
    }
}
