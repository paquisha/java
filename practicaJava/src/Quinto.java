import java.util.Scanner;

public class Quinto {
    /*
    Confeccionar un programa que pida por teclado tres notas de un alumno, calcule el promedio e imprima alguno de estos mensajes:
    Si el promedio es >=7 mostrar "Promocionado".
    Si el promedio es >=4 y <7 mostrar "Regular".
    Si el promedio es <4 mostrar "Reprobado".
    * */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float notaUno, notaDos, notaTres, promedio;

        System.out.println("Ingrese primera nota: ");
        notaUno = teclado.nextFloat();

        System.out.println("Ingrese segunda nota: ");
        notaDos = teclado.nextFloat();

        System.out.println("Ingrese tercera nota: ");
        notaTres = teclado.nextFloat();

        promedio = (notaUno+notaDos+notaTres)/3;

        if(promedio >= 7){
            System.out.println("Promocionado, nota: " + promedio);
        }else{
            if(promedio >= 4 && promedio < 7){
                System.out.println("Regular, nota: " + promedio);
            }else{
                System.out.println("Reprobado, nota: " + promedio);
            }
        }
    }
}
