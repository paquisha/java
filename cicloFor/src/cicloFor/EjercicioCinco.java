/*
 * Escribir un programa que lea n números enteros y calcule la cantidad de valores mayores o iguales a 1000.
 */
package cicloFor;

import java.util.Scanner;

public class EjercicioCinco {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int i, num1, mayores = 0, enteros;
		
		System.out.print("Ingrese cantidad a evaluar: ");
		num1 = num.nextInt();
		
		for(i = 1; i <= num1; i++) {
			System.out.print("Ingrese valor: ");
			enteros = num.nextInt();
			if(enteros >= 1000) {
				mayores = mayores + 1;
			}
		}
		System.out.print("la cantidad de valores mayores o iguales a 1000 es: " + mayores);
	}
}
