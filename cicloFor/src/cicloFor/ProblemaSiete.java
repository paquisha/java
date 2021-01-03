/*
 * Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
a) La cantidad de valores ingresados negativos.
b) La cantidad de valores ingresados positivos.
c) La cantidad de múltiplos de 15.
d) El valor acumulado de los números ingresados que son pares.
 */
package cicloFor;

import java.util.Scanner;

public class ProblemaSiete {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int i, pares = 0, negativos = 0, positivos = 0, multiplos = 0, num1;
		
		for(i = 1; i <= 10; i++) {
			System.out.print("Ingrese numero: ");
			num1 = num.nextInt();
			if(num1 < 0) {
				negativos = negativos + 1;
			}else {
				positivos = positivos + 1;
			}
			
			if(num1 % 15 == 0) {
				multiplos = multiplos + 1;
			}
			
			if(num1 % 2 == 0) {
				pares = pares + num1;
			}
		}
		System.out.print("cantidad de negativos: " + negativos + "\n");
		System.out.print("cantidad de positivos: " + positivos + "\n");
		System.out.print("cantidad de multiplos de 15: " + multiplos + "\n");
		System.out.print("cantidad de valor acumulado de pares: " + pares);
	}
}
