/*
 * Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y (distintos a cero).
Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
 */
package planoCartesiano;

import java.util.Scanner;

public class PlanoCartesiano {
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		float x, y;
		
		System.out.print("Ingrese coordenada x: ");
		x = num.nextFloat();
		System.out.print("Ingrese coordenada y: ");
		y = num.nextFloat();
		
		if(x > 0 && y > 0) {
			System.out.print("Esta en el primer cuadrante");
		}else {
			if(x < 0 && y > 0) {
				System.out.print("Esta en el segundo cuadrante");
			}else {
				if(x < 0 && y < 0) {
					System.out.print("Esta en el tercer cuadrante");
				}else {
					if(x > 0 && y < 0) {
						System.out.print("Esta en el cuarto cuadrante");
					}
				}
			}
		}
	}

}
