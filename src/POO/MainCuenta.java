package POO;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Juan", 100);
        c.ingresar(100);
        c.retirar(20);

        System.out.println(c);
    }
}
