/*
 * Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente la suma de los valores ingresados y su promedio.
 */
package ejerciciosWhile;

import java.util.Scanner;

public class tercero {
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int suma = 0,num1,x = 1, promedio;
		
		while(x <= 10) {
			System.out.print("Ingrese numero: ");
			num1 = num.nextInt();
			suma = suma + num1;
			x = x + 1;
		}
		
		promedio = suma / 10;
		
		System.out.print("La suma es: " + suma + "\n");
		System.out.print("El promedio es: " + promedio);
		
	}

}
