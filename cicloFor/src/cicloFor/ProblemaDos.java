/*
 * Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.
 */
package cicloFor;

import java.util.Scanner;

public class ProblemaDos {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int i,j, numeros, suma = 0;
		for(i = 1; i <= 10; i++) {
			System.out.print("Ingrese numero: ");
			numeros = num.nextInt();
			if(i > 5) {
				suma = suma + numeros;
			}
		}
		System.out.print("la suma de los ultimos 5 digitos es: " + suma);
	}
}
