import java.util.Scanner;

public class VectoPrimero {
    //Se desea guardar los sueldos de 5 operarios.
    //Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto momento los 5 sueldos almacenados en memoria.
    //Empleando un vector solo se requiere definir un único nombre y accedemos a cada elemento por medio del subíndice.
    private Scanner ingreso;
    private int[] sueldos;

    public void cargarDatos(){
        ingreso = new Scanner(System.in);
        sueldos = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese el valor del componente: ");
            sueldos[i] = ingreso.nextInt();
        }
    }

    public void imprimirDatos(){
        for(int i = 0; i < 5; i++){
            System.out.println(sueldos[i]);
        }
    }

    public static void main(String[] args) {
        VectoPrimero vector = new VectoPrimero();
        vector.cargarDatos();
        vector.imprimirDatos();
    }
}
