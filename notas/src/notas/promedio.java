/*
 * Confeccionar un programa que pida por teclado tres notas de un alumno, calcule el promedio e imprima alguno de estos mensajes:
Si el promedio es >=7 mostrar "Promocionado".
Si el promedio es >=4 y <7 mostrar "Regular".
Si el promedio es <4 mostrar "Reprobado".
 */
package notas;

import java.util.Scanner;

public class promedio {
	public static void main(String[] args) {
		float nota1, nota2, nota3, promedio;
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Ingrese primera nota: ");
		nota1 = num.nextFloat();
		System.out.print("Ingrese segunda nota: ");
		nota2 = num.nextFloat();
		System.out.print("Ingrese tercera nota: ");
		nota3 = num.nextFloat();
		
		promedio = nota1 + nota2 + nota3/3;
		
		if(promedio >= 7) {
			System.out.print("Promocionado, su calificacion es: " + promedio);
		}else{
			if(promedio >= 4 && promedio <7) {
				System.out.print("Regular, su califiacion es: " + promedio);
			}else {
				System.out.print("Usted esta Reprobado, su calificacion es: " + promedio);
			}
		}
		
		
	}
}
