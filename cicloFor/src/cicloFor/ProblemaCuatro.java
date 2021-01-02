/*
 * Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.
 */
package cicloFor;

import java.util.Scanner;

public class ProblemaCuatro {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int i, tabla, multiplicar;
		
		System.out.print("Ingrese numero para tabla, solo del 1 al 10: ");
		tabla = num.nextInt();
		
		if(tabla > 0 && tabla <=10) {
			
			for(i = 1; i <= 12; i++) {
				multiplicar = tabla * i;
				System.out.print( tabla + " x " + i + " = " + multiplicar + "\n");
			}			
		}else {
			System.out.print("solo permite valores del 1 al 10");
		}
		

	}
}
