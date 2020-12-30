/*
 * Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 */
package ejerciciosWhile;

import java.util.Scanner;

public class problemaUno {
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int x = 1;
		float notas;
		int mayores = 0, menores = 0;
		
		while(x <= 10) {
			System.out.print("Ingrese nota:");
			notas = num.nextFloat();
			
			if(notas >= 7) {
				mayores = mayores + 1;
			}else {
				if(notas < 7) {
					menores = menores + 1;
				}
			}
		}
		System.out.print("la cantidad de notas mayores o iguales a 7 es: " + mayores + "\n");
		System.out.print("La cantidad de notas menores a 7 es: " + menores);
	}

}
