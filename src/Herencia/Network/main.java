package Herencia.Network;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Publicacion> listaPublicaciones = new ArrayList<>();
        Usuario Mimi = new Usuario("Mimi", "Mimi Lopez", 1);

        Usuario Lala = new Usuario("Lala", "Lala Lopez", 2);

        Mensaje mensaje = new Mensaje(Mimi, 1, "Hola girlies <3");
        mensaje.darLike();
        mensaje.darLike();
        mensaje.darLike();
        mensaje.darLike();
        mensaje.darDislike();

        listaPublicaciones.add(mensaje);

        Fotografia fotografia = new Fotografia(Lala, "Foto 1", "teamgirlies.png");
        fotografia.darLike();

        listaPublicaciones.add(fotografia);

        Mensaje a = new Mensaje(Mimi, 2, "Reinas!");
        mensaje.darLike();

        listaPublicaciones.add(a);

        Comentario c = new Comentario("Holaaa", Mimi, mensaje);
        System.out.println(c);

    }

    public static void buscarUsuario(Usuario usuario, List<Publicacion> listaPublicaciones) {
        listaPublicaciones.stream()
                .filter(p -> p.getUsuario().getNombre().equals(usuario.getNombre()))
                .forEach(System.out::println);
    }
}
