import java.util.Scanner;

//Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
//El valor acumulado de todos los elementos del vector.
//El valor acumulado de los elementos del vector que sean mayores a 36.
//Cantidad de valores mayores a 50.
public class VectorCuarto {
    private Scanner ingreso;
    private int[] vector;

    public void cargarDatos(){
        ingreso = new Scanner(System.in);
        vector = new int[8];
        for(int i = 0; i < 8; i++){
            System.out.print("Ingrese elemento: ");
            vector[i] = ingreso.nextInt();
        }
    }

    public void acumularElementos(){
        int suma = 0;
        for(int i = 0; i < 8; i++){
            suma = suma + vector[i];
        }
        System.out.println("La suma de los elementos es: " + suma);
    }

    public void acumularMayores36(){
        int suma = 0;
        for(int i = 0; i < 8; i++){
            if (vector[i] > 36) {
                suma = suma + vector[i];
            }
        }
        System.out.println("La suma de los elementos mayores a 36  es: " + suma);
    }

    public void cantidadElementos50(){
        int cantidad = 0;
        for(int i = 0; i < 8; i++){
            if (vector[i] > 50) {
                cantidad++;
            }
        }
        System.out.println("La suma de los elementos mayores a 36  es: " + cantidad);
    }

    public static void main(String[] args) {
        VectorCuarto tor = new VectorCuarto();

        tor.cargarDatos();
        tor.acumularElementos();
        tor.acumularMayores36();
        tor.cantidadElementos50();
    }
}
