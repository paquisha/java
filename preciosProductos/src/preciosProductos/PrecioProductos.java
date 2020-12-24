/*
 * Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva 
 * el cliente. Mostrar lo que debe abonar el comprador.
 */
package preciosProductos;

import java.util.Scanner;

public class PrecioProductos {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		float precio, cantidad, total;
		
		System.out.print("Ingrese precio del producto: ");
		precio = num.nextFloat();
		System.out.print("Ingrese la cantidad: ");
		cantidad = num.nextFloat();
		
		total = precio * cantidad;
		
		System.out.print("El valor a cancelar es: " + total);
	}
}
