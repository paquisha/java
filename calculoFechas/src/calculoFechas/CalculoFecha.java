/*
 * Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.
 */

package calculoFechas;

import java.util.Scanner;

public class CalculoFecha {
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int dia, mes, anio;
		
		System.out.print("Ingrese dia: ");
		dia = num.nextInt();
		System.out.print("Ingrese mes: ");
		mes = num.nextInt();
		System.out.print("Ingrese año: ");
		anio = num.nextInt();
		
		if(dia == 25 && mes == 12) {
			System.out.print(dia + "-" + mes + "-" + anio +", es navidad");
		}else {
			System.out.print(dia + "-" + mes + "-" + anio +", no es navidad");
		}
		
	}
}
