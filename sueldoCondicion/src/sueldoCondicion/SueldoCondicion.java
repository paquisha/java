/*
 * Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.
 */
package sueldoCondicion;

import java.util.Scanner;

public class SueldoCondicion {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		float sueldo;
		String nombre;
		
		System.out.print("Ingrese el nombre del empleado:");
		nombre = num.next();
		
		System.out.print("Ingrese sueldo de empleado: ");
		sueldo = num.nextFloat();
		
		if(sueldo > 3000) {
			System.out.print(nombre +", Debe pagar impuestos por sueldo de: " +sueldo);
		}else {
			System.out.print(nombre+", no debe pagar impuestos");
		}
		
	}
}
