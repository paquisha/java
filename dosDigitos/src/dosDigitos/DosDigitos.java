/*
 * Se ingresa por teclado un n�mero positivo de uno o dos d�gitos (1..99) mostrar un mensaje indicando si el n�mero tiene uno o dos d�gitos.
(Tener en cuenta que condici�n debe cumplirse para tener dos d�gitos, un n�mero entero)
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
