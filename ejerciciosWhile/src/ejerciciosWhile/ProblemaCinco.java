/*
 * Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.
 */
package ejerciciosWhile;

public class ProblemaCinco {
	
	public static void main(String[] args) {
		int x =1;
		while(x <= 500) {
			System.out.print(x);
			System.out.print(" - ");
			x = x + 8;
		}
	}

}
