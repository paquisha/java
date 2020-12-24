/*
 * Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.
 */
package calculosBasicosDos;

import java.util.Scanner;

public class CalculosBasicos {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int num1, num2, num3, num4, suma, promedio;
		
		System.out.print("Ingrese numero uno: ");
		num1 = num.nextInt();
		System.out.print("Ingrese numero dos: ");
		num2 = num.nextInt();
		System.out.print("Ingrese numero tres: ");
		num3 = num.nextInt();
		System.out.print("Ingrese numero cuatro: ");
		num4 = num.nextInt();
		
		suma = num1 + num2 + num3 + num4;
		promedio = suma / 4;
		
		System.out.print("la suma  es: " + suma + "\n");
		System.out.print("El promedio es: " + promedio);
		
		
	}
}
