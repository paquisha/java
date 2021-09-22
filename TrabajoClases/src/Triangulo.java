/*
 * Desarrollar un programa que cargue los lados de un triángulo e implemente los siguientes métodos: 
 * inicializar los atributos, 
 * imprimir el valor del lado mayor y otro método que muestre si es equilatero o no.
 */

import java.util.Scanner;
public class Triangulo {
	private Scanner ingreso;
	private int lado1, lado2,lado3;
	
	public void inicio() {
		ingreso = new Scanner(System.in);
		System.out.print("Medida lado 1: ");
		lado1 = ingreso.nextInt();
		System.out.print("Medida lado 2: ");
		lado2 = ingreso.nextInt();
		System.out.print("Medida lado 3: ");
		lado3 = ingreso.nextInt();
	}
	
	public void ladoMayor() {
		System.out.print("Lado mayor: ");
		if(lado1 > lado2 && lado1 > lado3) {
			System.out.println(lado1);
		}else {
			if(lado2 > lado3) {
				System.out.println(lado2);
			}else {
				System.out.println(lado3);
			}
		}
	}
	
	public void esEquilatero() {
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.print("Es un triangulo equilatero");
		}else {
			System.out.print("no es un triangulo equilatero");
		}
	}
	
	public static void main(String[] args) {
		Triangulo triangulo1 = new Triangulo();
		triangulo1.inicio();
		triangulo1.ladoMayor();
		triangulo1.esEquilatero();		
	}
}
