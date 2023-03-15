import java.util.Scanner;

public class decimoSexto {
    /*Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen
    notas mayores o iguales a 7 y cuántos menores.*/
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        int alumnos = 0, contadorMas = 0, contadorMenos = 0, contador = 1;
        float notas;

        System.out.println("Ingrese numero numero de estudiantes a procesar: ");
        alumnos = ingreso.nextInt();

        while(contador <= alumnos){
            System.out.println("Ingrese nota: ");
            notas = ingreso.nextFloat();

            if(notas >= 7){
                contadorMas = contadorMas +1;
            }

            if(notas < 7){
                contadorMenos = contadorMenos + 1;
            }

            contador = contador + 1;
        }

        System.out.println("Numero de estudiantes mayores o iguales a 7: " + contadorMas);
        System.out.println("Numero de estudiantes menores a 7: " + contadorMenos);
    }
}
