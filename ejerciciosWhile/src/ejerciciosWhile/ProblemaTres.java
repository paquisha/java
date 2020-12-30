/*
 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea los sueldos que 
 * cobra cada empleado e informe cuántos empleados cobran * entre $100 y $300 y cuántos cobran más de $300. Además el programa 
 * deberá informar el importe que gasta la empresa en sueldos al personal.
 */
package ejerciciosWhile;

import java.util.Scanner;

public class ProblemaTres {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int x = 1, empleados;
		float mayores = 0, menores = 0, sueldo, importe, suma = 0;
		
		System.out.print("Ingrese cantidad de empleados: ");
		empleados = num.nextInt();
		
		while(x <= empleados) {
			System.out.print("Ingrese sueldo: ");
			sueldo = num.nextFloat();
			if(sueldo > 300) {
				mayores = mayores + 1;				
			}else {
				menores = menores + 1;
			}
			suma = suma + sueldo;
			x = x + 1;
		}
		System.out.print("cantidad de empleados que cobran entre $100 y $300: " + menores + "\n");
		System.out.print("Cantidad de empleados que cobran mas de $300: " + mayores + "\n");
		System.out.print("Importe en nomina de empleados: " + suma);
	}
}
