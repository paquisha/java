/*
 * Escribir un programa que lea 10 n�meros enteros y luego muestre cu�ntos valores ingresados fueron m�ltiplos de 3 y cu�ntos de 5. 
 * Debemos tener en cuenta que hay n�meros que son m�ltiplos de 3 y de 5 a la vez.
 */
package cicloFor;

import java.util.Scanner;

public class EjercicioCuatro {
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int i, deTres = 0, deCinco = 0, num1;
		for(i = 1; i<=10; i++) {
			System.out.print("Ingrese numero: ");
			num1 = num.nextInt();
			if(num1 % 3 == 0) {
				deTres = deTres + 1;
			}
			if(num1 % 5 == 0) {
				deCinco = deCinco + 1;
			}
		}
		System.out.print("Total de multiplos de tres: " + deTres + "\n");
		System.out.print("Total de multiplos de cinco: " + deCinco);
	}
}
