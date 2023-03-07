import java.util.Scanner;

public class Main {

    /*Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.
    * */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float sueldo, rango;

        System.out.println("ingrese rango de sueldo");
        rango = teclado.nextFloat();

        System.out.println("Ingrese sueldo de persona: ");
        sueldo = teclado.nextFloat();

        if(sueldo > rango){
            System.out.println("A pagar inpuestos, sueldo = " + sueldo);
        }else{
            System.out.println("pongase pilas estudie algo para que gane mas.");
        }

    }
}