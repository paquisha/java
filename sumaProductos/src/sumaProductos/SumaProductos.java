/*
 *Tenemos dos entradas num1 y num2 (recordar cuáles son los nombres de variables correctas), dos operaciones: realización de la suma 
 *y del producto de los valores ingresados y dos salidas, que son los resultados de la suma y el producto de los valores ingresados. 
 *En el símbolo de impresión podemos indicar una o más salidas, eso queda a criterio del programador, lo mismo para indicar las 
 *entradas por teclado.
 */ 
package sumaProductos;

import java.util.Scanner;

public class SumaProductos {
	
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		
		int num1, num2, suma, multiplicacion;
		System.out.print("Ingrese numero uno: ");
		num1 = num.nextInt();
		System.out.print("Ingrese numero dos: ");
		num2 = num.nextInt();
		suma = num1 + num2;
		multiplicacion = num1 * num2;
		System.out.print("La suma es: " + suma +"\n");
		System.out.print("la multiplicacion es: " + multiplicacion);
		
	}

}
