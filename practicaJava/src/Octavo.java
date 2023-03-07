import java.util.Scanner;

public class Octavo {
    /*
    Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando
    si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.
    */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese numero: ");
        numero = teclado.nextInt();

        if(numero > 999){
            System.out.println("Solo numero de 3 cifras.");
        }else{
            if(numero < 10){
                System.out.println(numero + " tiene una cifra");
            }else{
                if(numero > 9 && numero <= 99){
                    System.out.println(numero + " tiene dos cifras");
                }else{
                    System.out.println(numero + " tiene tres cifras");
                }
            }
        }
    }
}
