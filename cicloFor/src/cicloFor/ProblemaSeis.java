/*
 * Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante. 
Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.
 */
package cicloFor;

import java.util.Scanner;

public class ProblemaSeis {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int i, puntos, x,y, primero = 0, segundo = 0, tercero = 0, cuarto = 0;
		
		System.out.print("Ingresar cantidad de puntos a procesar:");
		puntos = num.nextInt();
		
		for(i = 1; i <= puntos; i++) {
			System.out.print("Ingrese coordenada x: ");
			x = num.nextInt();
			System.out.print("Ingrese coordenada y: ");
			y = num.nextInt();
			
			if(x > 0 && y > 0) {
				primero = primero + 1;
			}else {
				if(x < 0 && y > 0) {
					segundo = segundo + 1;
				}else {
					if(x < 0 && y < 0) {
						tercero = tercero + 1;
					}else {
						if(x > 0 && y < 0) {
							cuarto = cuarto + 1;
						}
					}
				}
			}
		}
		System.out.print("numero de coordenadas en el primer plano: " + primero + "\n");
		System.out.print("numero de coordenadas en el segundo plano: " + segundo + "\n");
		System.out.print("numero de coordenadas en el tercer plano: " + tercero + "\n");
		System.out.print("numero de coordenadas en el cuarto plano: " + cuarto + "\n");
	}
}
