import java.util.Scanner;

public class Segundo {

    /*Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia,
        en caso contrario informar el producto y la división del primero respecto al segundo.
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int primero, segundo;
        float division;

        System.out.println("Ingrese primer numero: ");
        primero = teclado.nextInt();

        System.out.println("Ingrese segundo numero: ");
        segundo = teclado.nextInt();

        if(primero > segundo){
            System.out.println("suma : " + (primero + segundo));
            System.out.println("resta: " + (primero - segundo));
        }else{
            System.out.println("multiplicacion: " + (primero * segundo));
            division = primero/segundo;
            System.out.println("division: " + division);
        }
    }
}
