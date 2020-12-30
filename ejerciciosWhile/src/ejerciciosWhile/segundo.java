/*
 * Escribir un programa que solicite la carga de un valor positivo y nos muestre desde 1 hasta el valor ingresado de uno en uno.
 */
package ejerciciosWhile;

import java.util.Scanner;

public class segundo {
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int num1, x = 1;
		
		System.out.print("Ingrese un numero");
		num1 = num.nextInt();
		
		while(x <= num1) {
			System.out.print(x);
			System.out.print(" - ");
			x = x + 1;
		}
		
	}

}
