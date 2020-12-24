package calculosBasicos;

import java.util.Scanner;

public class CalculosBasicos {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int num1, num2, num3, num4, suma, producto;
		
		System.out.print("Ingrese numero uno: ");
		num1 = num.nextInt();
		System.out.print("Ingrese numero dos: ");
		num2 = num.nextInt();
		System.out.print("Ingrese numero tres: ");
		num3 = num.nextInt();
		System.out.print("Ingrese numero cuatro: ");
		num4 = num.nextInt();
		
		suma = num1 + num2;
		producto = num3 * num4;
		
		System.out.print("la suma de los dos primeros es: " + suma +"\n");
		System.out.print("el producto del tercero y el cuarto es: " + producto);
	}
}
