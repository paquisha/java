/*
 * Desarrollar un programa que permita cargar n n�meros enteros y luego nos informe cu�ntos valores fueron pares y cu�ntos impares.
Emplear el operador % en la condici�n de la estructura condicional:
 */
package ejerciciosWhile;

import java.util.Scanner;

public class ProblemaSiete {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int x = 1, n, pares = 0, impares = 0, num1; 
		
		System.out.print("Ingrese valor de cantidad a evaluar: ");
		n = num.nextInt();
		
		while(x <= n) {
			System.out.print("Ingrese numero: ");
			num1 = num.nextInt();
			if(num1 % 2 == 0){
				pares = pares + 1;
			}else {
				impares = impares + 1;
			}
			x = x + 1;
		}
		System.out.print("Cantidad de numeros pares: " + pares + "\n");
		System.out.print("Cantidad de numeros impares: " + impares);
	}
}
