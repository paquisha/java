/*
 * Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla el mayor de ellos.
 */
package numeroMayor;

import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Ingrese numero uno: ");
		num1 = num.nextInt();
		System.out.print("Ingrese numero dos: ");
		num2 = num.nextInt();
		
		if(num1 > num2) {
			System.out.print(num1 +" es mayor que " + num2);
		}else {
			System.out.print(num2 + " es mayor que " + num1);
		}
		
	}
}
