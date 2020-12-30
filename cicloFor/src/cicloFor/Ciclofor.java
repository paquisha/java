/*
 * Realizar un programa que imprima en pantalla los números del 1 al 100.
 */
package cicloFor;

public class Ciclofor {
	public static void main(String[] args) {
		int i;
		for(i = 1; i <= 100; i = i + 4) {
			System.out.print(i);
			System.out.print(" - ");
		}
	}
}
