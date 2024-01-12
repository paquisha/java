import java.util.Scanner;

public class PruebaVector8 {
    //Se desea almacenar los sueldos de operarios. Cuando se ejecuta el programa se debe pedir la cantidad de sueldos a ingresar.
    // Luego crear un vector con dicho tamaño.

    private Scanner ingreso;
    private int[] sueldos;

    public void inicializar(){
        ingreso = new Scanner(System.in);
        System.out.println("Cuantos suldos se cargaran: ");
        int cantidad = ingreso.nextInt();

        sueldos = new int[cantidad];

        for (int i = 0; i < sueldos.length; i++){
            System.out.println("Ingrese sueldo de operario: ");
            sueldos[i] = ingreso.nextInt();
        }
    }

    public void imprimir(){
        for (int i = 0; i < sueldos.length; i++){
            System.out.println(sueldos[i]);
        }
    }

    public static void main(String[] args) {
        PruebaVector8 vector = new PruebaVector8();

        vector.inicializar();
        vector.imprimir();
    }
}