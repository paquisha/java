/*
 * Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que 
 * se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos 
 * datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
 */
package empleos;

import java.util.Scanner;

public class Empleos {
	public static void main(String[] args) {
		float cantidadPreguntas, preguntasCorrectas, porcentaje;
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad total de preguntas: ");
		cantidadPreguntas = num.nextInt();
		System.out.print("Ingrese cantidad de preguntas correctas: ");
		preguntasCorrectas = num.nextInt();
		
		porcentaje = preguntasCorrectas * 100 / cantidadPreguntas;
		
		if(porcentaje >= 90) {
			System.out.print("Nivel maximo " + porcentaje);
		}else {
			if(porcentaje >= 75 && porcentaje < 90) {
				System.out.print("Nivel medio " + porcentaje);
			}else {
				if(porcentaje >= 50 && porcentaje < 75) {
					System.out.print("Nivel regular " + porcentaje);
				}else {
					System.out.print("Fuera de nivel " + porcentaje);
				}
			}
		}
	}
}
