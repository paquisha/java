/*
 * Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo (El perímetro de un cuadrado 
 * se calcula multiplicando el valor del lado por cuatro)
 */
package perimetroCuadrado;

import java.util.Scanner;

public class perimetoCuadrado {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int lado, perimetro;
		System.out.print("Ingrese lado del cuadrado: ");
		lado = num.nextInt();
		perimetro = lado * 4;
		System.out.print("el perimetro del cuadrado es: " + perimetro);
	}
}
