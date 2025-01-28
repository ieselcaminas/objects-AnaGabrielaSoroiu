package POO;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Juan", 100);
        c.ingresar(-100);

        System.out.println(c);
    }
}
