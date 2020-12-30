/*
 * Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado)
 */
package ejerciciosWhile;

public class ProblemaCuatro {
	
	public static void main(String[] args) {
		int x = 1, suma = 0;
		
		while(x <= 25) {
			suma = suma + 11;
			System.out.print(suma);
			System.out.print(" - ");
			x = x + 1;
		}
	}

}
