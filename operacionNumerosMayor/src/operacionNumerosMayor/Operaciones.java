/*
 * Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma 
 * y diferencia, en caso contrario informar el producto y la división del primero respecto al segundo.
 */
package operacionNumerosMayor;


import java.util.Scanner;

public class Operaciones {
	public static void main(String[] args) {
		
		int num1, num2, suma, resta, producto, division;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Ingrese numero uno: ");
		num1 = num.nextInt();
		System.out.print("Ingrese numero dos: ");
		num2 = num.nextInt();
		
		if(num1 > num2) {
			suma = num1 + num2;
			resta = num1 - num2;
			System.out.print("La suma es: " + suma + "\n");
			System.out.print("La resta es: " + resta);
		}else {
			producto = num1 * num2;
			division = num1 / num2;
			System.out.print("El producto es: " + producto + "\n");
			System.out.print("La division es: " + division);
		}
	}
}
