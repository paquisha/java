package superficieCuadrado;

import java.util.Scanner;

public class SuperficieCuadrado {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int lado;
		int superficie;
		System.out.print("Ingrese el lado del cuadrado: ");
		lado = num.nextInt();
		superficie = lado * lado;
		System.out.print("La superficie del cuadrado es: "+ superficie);
	}
}
