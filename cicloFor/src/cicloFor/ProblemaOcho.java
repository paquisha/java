/*
 * Se cuenta con la siguiente informaci�n:
Las edades de 50 estudiantes del turno ma�ana.
Las edades de 60 estudiantes del turno tarde.
Las edades de 110 estudiantes del turno noche.
Las edades de cada estudiante deben ingresarse por teclado.
a) Obtener el promedio de las edades de cada turno (tres promedios)
b) Imprimir dichos promedios (promedio de cada turno)
c) Mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio de edades menor.
 */
package cicloFor;

import java.util.Scanner;

public class ProblemaOcho {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int i, j, k, edadManana, promedioManana = 0, suma = 0, edadTarde, promedioTarde = 0, sumaTarde = 0, edadNoche, promedioNoche = 0, sumaNoche = 0, day, tarde, noche;
		
		System.out.print("Ingrese cantidad de alumnos de la ma�ana: ");
		day = num.nextInt();
		System.out.print("Ingrese cantidad de alumnos de la tarde: ");
		tarde = num.nextInt();
		System.out.print("Ingrese cantidad de alumnos de la noche: ");
		noche = num.nextInt();
		
		/*turno de la ma;ana*/
		for(i = 1; i <= day; i++) {
			System.out.print("Ingrese edad, turno ma�ana");
			edadManana = num.nextInt();
			suma = suma + edadManana;
			promedioManana = suma / day;
			System.out.print("promedio de edades de la ma�ana es: " + promedioManana);
		}
		/*edad turno de la tarde*/
		for(i = 1; i <= tarde; i++) {
			System.out.print("Ingrese edad, turno ma�ana");
			edadTarde = num.nextInt();
			sumaTarde = sumaTarde + edadTarde;
			promedioTarde = sumaTarde / tarde;
			System.out.print("promedio de edades de la ma�ana es: " + promedioTarde);
		}
		/*edad turno de la noche, agregar 0 a cada condicion de for*/
		for(i = 1; i <= noche; i++) {
			System.out.print("Ingrese edad, turno ma�ana");
			edadNoche = num.nextInt();
			sumaNoche = sumaNoche + edadNoche;
			promedioNoche = sumaNoche / noche;
			System.out.print("promedio de edades de la ma�ana es: " + promedioNoche);
		}
		
		if(promedioManana < promedioTarde && promedioManana < promedioNoche) {
			System.out.print("Promedio de la ma�ana es menor con: " + promedioManana);
		}else {
			if(promedioTarde < promedioNoche) {
				System.out.print("Promedio de la tarde es menor con: " + promedioTarde);
			}else {
				System.out.print("Promedio de la ma�ana es menor con: " + promedioNoche);
			}
		}
		
	}
}
