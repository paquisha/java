/*
 * Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
 */
package numeroMayor;

import java.util.Scanner;

public class TresNumeros {
	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Ingrese numero uno: ");
		num1 = num.nextInt();
		System.out.print("Ingrese numero dos: ");
		num2 = num.nextInt();
		System.out.print("Ingrese numero tres: ");
		num3 = num.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.print(num1 + " Es mayor");
		}else {
			if(num2 > num1 && num2 >num3) {
				System.out.print(num2 + " Es mayor");
			}else {
				System.out.print(num3 + " Es mayor");
			}
		}
	}
}
