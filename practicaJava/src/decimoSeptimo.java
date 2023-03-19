import java.util.Scanner;

public class decimoSeptimo {
    /*Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas.*/
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        float altura = 0, suma = 0, promedio = 0, contador = 0;
        int personas = 1;

        System.out.println("Ingrese cantidad de personas");
        personas = ingreso.nextInt();


        while (contador <= personas){
            System.out.println("Ingrese altura");
            altura = ingreso.nextFloat();
            suma += altura;
            contador += 1;
        }

        promedio = suma/personas;
        System.out.println("promedio de alturas de " + personas + " es: " + promedio);
    }
}
