import java.util.Scanner;

public class Sexto {
    /*
    Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
    * */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numeroUno, numeroDos, numeroTres;

        System.out.println("Ingrese primer numero: ");
        numeroUno = teclado.nextInt();

        System.out.println("Ingrese segundo numero: ");
        numeroDos = teclado.nextInt();

        System.out.println("Ingrese tercer numero: ");
        numeroTres = teclado.nextInt();

        if(numeroUno > numeroDos){
            System.out.println(numeroUno + " es mayor");
        }else{
            if(numeroDos > numeroTres){
                System.out.println(numeroDos + " es mayor");
            }else{
                System.out.println(numeroTres + " es mayor");
            }
        }
    }
}
