/*
 * Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente la suma de los valores ingresados y su promedio.
 *  Este problema ya lo desarrollamos , lo resolveremos empleando la estructura for.
 */
package cicloFor;

import java.util.Scanner;

public class EjercicioDos {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int i, num1, suma = 0, promedio;
		for(i = 1; i <= 10; i++) {
			System.out.print("Ingrese numero: ");
			num1 = num.nextInt();
			suma = suma + num1;
		}
		promedio = suma / 10;
		System.out.print("La suma es: " + suma + "\n");
		System.out.print("El promedio es: " + promedio);
	}
}
