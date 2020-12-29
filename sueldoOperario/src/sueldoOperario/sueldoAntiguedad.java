/*
 * De un operario se conoce su sueldo y los a�os de antig�edad. Se pide confeccionar un programa que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antig�edad es igual o superior a 10 a�os, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b)Si el sueldo es inferior a 500 pero su antig�edad es menor a 10 a�os, otorgarle un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
 */
package sueldoOperario;

import java.util.Scanner;

public class sueldoAntiguedad {
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		float sueldo, aumento, porcentaje, total;
		int anios;
		
		System.out.print("Ingrese sueldo: ");
		sueldo = num.nextFloat();
		System.out.print("Ingrese antig�edad: ");
		anios = num.nextInt();
		
		if(sueldo < 500 && anios > 10) {
			aumento = 20 * sueldo/100;
			total = sueldo + aumento;
			System.out.print("empleado con mas de 10 a�os de experiencia, sueldo total es: " + total);
		}else {
			if(sueldo < 500 && anios < 10) {
				aumento = 5 * sueldo / 100;
				total = sueldo + aumento;
				System.out.print("empleado con menos de 10 a�os de experiencia, sueldo total es: " + total);
			}else {
				if(sueldo > 500) {
					System.out.print("Suldo total es: " + sueldo);
				}
			}
		}
		
	}

}
