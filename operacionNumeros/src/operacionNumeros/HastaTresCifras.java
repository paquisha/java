/*
 * Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un 
 * mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.
 */
package operacionNumeros;

import java.util.Scanner;

public class HastaTresCifras {
	public static void main(String[] args) {
		int num1;
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		num1 = num.nextInt();
		
		if(num1 < 10) {
			System.out.print(num1 + " tiene una cifra");
		}else {
			if(num1 < 99) {
				System.out.print(num1 + " tiene dos cifras");
			}else {
				System.out.print(num1 + " tiene tres cifras");
			}
		}
	}
}
