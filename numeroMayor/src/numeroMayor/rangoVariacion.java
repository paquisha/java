/*
 * Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se 
 * calcule e informe su rango de variación (debe mostrar el mayor y el menor de ellos)
 */
package numeroMayor;

import java.util.Scanner;

public class rangoVariacion {
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Ingrese numero uno: ");
		num1 = num.nextInt();
		System.out.print("Ingrese numero dos: ");
		num2 = num.nextInt();
		System.out.print("Ingrese numero tres: ");
		num3 = num.nextInt();
		
		if(num1 < num2 && num1 < num3) {
			System.out.print(num1 + "\n");
		}else {
			if(num2 < num3) {
				System.out.print(num2 + "\n");
			}else {
				System.out.print(num3 + "\n");
			}
		}
		if(num1 > num2 && num1 > num3) {
			System.out.print(num1 + "\n");
		}else {
			if(num2 > num3) {
				System.out.print(num2 + "\n");
			}else {
				System.out.print(num3 + "\n");
			}
		}
	}

}
