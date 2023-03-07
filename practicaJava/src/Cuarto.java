import java.util.Scanner;

public class Cuarto {
    /*
    Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando si el número tiene uno o dos dígitos.
    (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese numero: ");
        numero = teclado.nextInt();

        if(numero >= 10){
            System.out.println(numero + " tiene dos o mas cifras");
        }else{
            System.out.println(numero +" tiene una cifra");
        }
    }
}
