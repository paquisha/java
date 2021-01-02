/*
 * Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)
 */
package cicloFor;

import java.util.Scanner;

public class ProblemaTres {
	public static void main(String[] args) {
		int i, multiplicar;
		for(i = 1; i <= 50; i++) {
			multiplicar = 5 * i;
			System.out.print("5 x " + i +" = " + multiplicar + "\n");
		}
	}
}
