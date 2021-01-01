/*
 * Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo. 
 * El programa deberá informar:
a) De cada triángulo la medida de su base, su altura y su superficie.
b) La cantidad de triángulos cuya superficie es mayor a 12.
 */
package cicloFor;

import java.util.Scanner;

public class ProblemaUno {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int i, mayorDoce = 0, triangulos, base, altura, superficie;
		System.out.print("Ingrese la cantidad de triangulos: ");
		triangulos = num.nextInt();
		
		for(i = 1; i <= triangulos; i++) {
			System.out.print("Ingrese el valor de la base: ");
			base = num.nextInt();
			System.out.print("Ingrese e; va;or de la altura: ");
			altura = num.nextInt();
			superficie = base * altura / 2;
			System.out.print("La base del triangulo es: " + base + "\n");
			System.out.print("La altura del triangulo es: " + altura + "\n");
			System.out.print("La superficie del triangulo es: " + superficie + "\n");
			
			if(superficie >= 12) {
				mayorDoce = mayorDoce + 1;
			}
		}
		System.out.print("La cantidad de triangulos con superficie mayor o igual a 12 es: " + mayorDoce);
	}
}
