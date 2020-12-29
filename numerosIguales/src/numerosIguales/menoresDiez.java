/*
 * Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, 
 * imprimir en pantalla la leyenda "Todos los números son menores a diez".
 */
package numerosIguales;

import java.util.Scanner;

public class menoresDiez {
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Ingrese numero uno: ");
		num1 = num.nextInt();
		System.out.print("Ingrese numero dos: ");
		num2 = num.nextInt();
		System.out.print("Ingrese numero tres: ");
		num3 = num.nextInt();
		
		if(num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.print("Todos son menores a 10");
		}else {
			System.out.print("al menos uno no es menor a 10");
		}
	}

}
