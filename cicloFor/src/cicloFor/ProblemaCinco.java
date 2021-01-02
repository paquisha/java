/*
 * Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
b) Cantidad de triángulos de cada tipo.
c) Tipo de triángulo que posee menor cantidad.
 */
package cicloFor;

import java.util.Scanner;

public class ProblemaCinco {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int i,j, triangulos, lado1, lado2, lado3, equilatero = 0, isosceles = 0, escaleno = 0, menor = 0;
		
		System.out.print("Ingrese cantidad de triangulos a evaluar: ");
		triangulos = num.nextInt();
		
		for(i = 1; i <= triangulos; i++) {
			System.out.print("Ingrese lado uno: ");
			lado1 = num.nextInt();
			System.out.print("Ingrese lado dos: ");
			lado2 = num.nextInt();
			System.out.print("Ingrese lado tres: ");
			lado3 = num.nextInt();
			
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.print("triangulo equilatero\n");
				equilatero = equilatero + 1;
			}else {
				if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
					System.out.print("triangulo isosceles\n");
					isosceles = isosceles + 1;
				}else {
					System.out.print("triangulo escaleno\n");
					escaleno = escaleno + 1;
				}
			}			
			
		}
		
		System.out.print("cantidad de triangulos equilateros es: " + equilatero + "\n");
		System.out.print("cantidad de triangulos isosceles es: " + isosceles + "\n");
		System.out.print("cantidad de triangulos escalenos es: " + escaleno + "\n");
		
		if(equilatero < isosceles && equilatero < escaleno) {
			System.out.print("triangulo equilatero posee la menor cantidad con: " + equilatero + "\n");
		}else {
			if(isosceles < escaleno) {
				System.out.print("triangulo isosceles posee la menor cantidad con: " + isosceles + "\n");
			}else {
				System.out.print("triangulo escaleno posee la menor cantidad con: " + escaleno);
			}
		}
	}
}
