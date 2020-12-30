/*
 * Realizar un programa que permita cargar dos listas de 15 valores cada una. Informar con un mensaje cual de las dos listas 
 * tiene un valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
	Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.
 */
package ejerciciosWhile;

import java.util.Scanner;

public class ProblemaSeis {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int x1 = 1, x2 = 1, mayor1 = 0, mayor2 = 0, suma1 = 0, suma2 = 0, lista1, lista2;
		
		while(x1 <= 15) {
			System.out.print("Ingrese numero, primera lista: ");
			lista1 = num.nextInt();
			suma1 = suma1 + lista1;
			x1 = x1 + 1;
		}
		
		while(x2 <= 15) {
			System.out.print("Ingrese numero, segunda lista: ");
			lista2 = num.nextInt();
			suma2 = suma2 + lista2;
			x2 = x2 + 1;
		}
		
		if(suma1 > suma2) {
			System.out.print("Lista uno, tiene mayor valor acumulado: " + suma1);
		}else {
			if(suma2 > suma1) {
				System.out.print("Lista dos, tiene mayor valor acumulado: " + suma2);
			}else {
				System.out.print(suma1 +" son iguales " + suma2);
			}
		}
	}

}
