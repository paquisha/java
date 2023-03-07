import java.util.Scanner;

public class tercero {
    //Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float notaUno, notaDos, notaTres, promedio;

        System.out.println("Ingrese primera nota: ");
        notaUno = teclado.nextFloat();

        System.out.println("Ingrese segunda nota: ");
        notaDos = teclado.nextFloat();

        System.out.println("Ingrese tercera nota: ");
        notaTres = teclado.nextFloat();

        promedio = (notaUno + notaDos + notaTres)/3;

        if (promedio >= 7){
            System.out.println("Promocionado, nota: " + promedio);
        }else{
            System.out.println("Eres una verguenza para la familia, nota: " + promedio);
        }
    }
}
