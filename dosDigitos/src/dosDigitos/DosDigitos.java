/*
 * Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
 */
package dosDigitos;

import java.util.Scanner;

public class DosDigitos {
	
	public static void main(String[] args) {
		int num1;
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Ingrese numero a evaluar: ");
		num1 = num.nextInt();
		
		if(num1 >= 10) {
			System.out.print( num1 + " tiene dos digitos");
		}else {
			System.out.print(num1 + " tiene un digito");
		}
		
	}

}
