public class Principal {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.fabricante = "ford";
        auto.modelo = "mustang";
        auto.color = "rojo";
        auto.cilindraje = 6.0;

        System.out.println("auto.fabricante: " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindraje = " + auto.cilindraje);
    }
}
