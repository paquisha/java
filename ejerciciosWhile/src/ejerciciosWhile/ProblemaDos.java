/*
 * Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas.
 */
package ejerciciosWhile;

import java.util.Scanner;

public class ProblemaDos {
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int x = 1;
		float altura, promedio, suma = 0;
		int n;
		
		System.out.print("Ingrese cantidad de personas a evaluar: ");
		n = num.nextInt();
		
		while(x <= n) {
			System.out.print("Ingrese altura: ");
			altura = num.nextFloat();
			suma = suma + altura;
			x = x + 1;
		}
		promedio = suma / n;
		System.out.print("el promedio es: " + promedio);
	}
}
