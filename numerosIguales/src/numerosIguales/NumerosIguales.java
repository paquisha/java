/*
 * Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero 
 * con el segundo y a este resultado se lo multiplica por el tercero.
 */
package numerosIguales;

import java.util.Scanner;

public class NumerosIguales {
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int num1, num2, num3, suma, multiplicacion;
		
		System.out.print("Ingrese numero uno: ");
		num1 = num.nextInt();
		System.out.print("Ingrese numero dos: ");
		num2 = num.nextInt();
		System.out.print("Ingrese numero tres: ");
		num3 = num.nextInt();
		
		if(num1 == num2 && num1 == num3) {
			suma = num1 + num3;
			multiplicacion = suma * num3;
			System.out.print("resultado es: " + multiplicacion);
		}else {
			System.out.print("los numeros no son iguales");
		}
		
	}
}
