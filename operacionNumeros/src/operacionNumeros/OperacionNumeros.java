/*
 * Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo.
 */
package operacionNumeros;

import java.util.Scanner;

public class OperacionNumeros {
	public static void main(String[] args) {
		int num1;
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		num1 = num.nextInt();
		
		if(num1 > 0) {
			System.out.print(num1 +" Es positivo");
		}else {
			if(num1 < 0) {
				System.out.print(num1 + " Es negativo");
			}else {
				System.out.print(num1 + " Es cero");
			}
		}
	}
}
