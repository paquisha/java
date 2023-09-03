import javax.swing.*;
import java.util.Scanner;

public class dia1While {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Menu");
            System.out.println("1, Una planta que fabrica perfiles de hierro posee un lote de n piezas.\n" +
                    "Confeccionar un programa que pida ingresar por teclado la cantidad de piezas a procesar y luego ingrese la longitud de cada perfil;\n" +
                    "sabiendo que la pieza cuya longitud esté comprendida en el rango de 1,20 y 1,30 son aptas. Imprimir por pantalla la cantidad de piezas aptas que hay en el lote.");
            System.out.println("2, Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.");
            System.out.println("3, Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas.");
            System.out.println("4, En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea los sueldos que cobra cada empleado e informe\n"+
                    "cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300. Además el programa deberá informar el importe que gasta la empresa en sueldos al personal.");
            System.out.println("5, Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado)");
            System.out.println("6, Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.");
            System.out.println("7, Realizar un programa que permita cargar dos listas de 15 valores cada una. Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor\n"+
                    "(mensajes 'Lista 1 mayor', 'Lista 2 mayor', 'Listas iguales')\n" +
                    "Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.");
            System.out.println("Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares.\n" +
                    "Emplear el operador % en la condición de la estructura condicional:\n" +
                    "\tif (valor%2==0)         //Si el if da verdadero luego es par.");
            opcion = menu.nextInt();

            switch (opcion){
                case 1:
                    Scanner ingreso = new Scanner(System.in);
                    int cantidad = 0;
                    int valor;
                    int x = 1;
                    float largo = 0;

                    System.out.println("Ingrese valor: ");
                    if(ingreso.hasNextInt()){
                        valor = ingreso.nextInt();

                        while(x <= valor){
                            System.out.println("Ingrese largo del perfil: ");
                            if(ingreso.hasNextFloat()){
                                largo = ingreso.nextFloat();
                                if(largo >= 1.20 && largo <= 1.30){
                                    cantidad += 1;
                                }
                            }else{
                                System.out.println("Valor no es correcto");
                                return;
                            }
                            x += 1;
                        }

                        if(cantidad > 0){
                            System.out.println("Cantidad de piezas actas: " + cantidad);
                        }else{
                            System.out.println("ningun perfil valido");
                        }

                    }else{
                        System.out.println("El valor ingresado no es numerico");
                    }
                    break;
                case 2:

                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 8);
        menu.close();
    }
}
