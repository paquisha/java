/*
 * Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".
 */
package notas;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		float nota1, nota2, nota3, promedio;
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Ingrese primera nota: ");
		nota1 = num.nextFloat();
		System.out.print("Ingrese segunda nota: ");
		nota2 = num.nextFloat();
		System.out.print("Ingrese tercera nota: ");
		nota3 = num.nextFloat();
		
		promedio = nota1 + nota2 + nota3 / 3;
		
		if(promedio >= 7) {
			System.out.print("Aprobado con: " + promedio);
		}else{
			System.out.print("Reprobado con: " + promedio);
		}
	}
}
