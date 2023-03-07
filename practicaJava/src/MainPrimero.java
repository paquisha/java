import java.util.Scanner;

public class MainPrimero {
    public static void main(String[] args) {
        //Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla el mayor de ellos.

        Scanner teclado = new Scanner(System.in);
        int primero, segundo;

        System.out.println("Ingrese primer numero: ");
        primero = teclado.nextInt();

        System.out.println("Ingrese segundo numero: ");
        segundo = teclado.nextInt();

        if(primero > segundo){
            System.out.println(primero + " es mayor");
        }else{
            System.out.println(segundo + " es mayor");
        }
    }
}
