/*
 * Escribir un programa que lea 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 */
package cicloFor;

import java.util.Scanner;

public class EjercicioTres {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int i, notas, mayores = 0, menores = 0, suma, promedio;
		
		for(i = 1; i <= 10; i++) {
			System.out.print("Ingrese nota: ");
			notas = num.nextInt();
			if(notas >= 7) {
				mayores = mayores + 1;
			}else {
				menores = menores + 1;
			}
		}
		System.out.print("total de notas mayores: " + mayores + "\n");
		System.out.print("total de notas menores: " + menores);
	}
}
