import java.util.Scanner;

/*Implementar la clase operaciones. 
 * Se deben cargar dos valores enteros, calcular su suma, resta, multiplicación y división, 
 * cada una en un método, imprimir dichos resultados.
 * 
 * */
public class Calculadora {
	private int num1;
	private int num2;
	private Scanner teclado;
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese numero 1: ");
		num1 = teclado.nextInt();
		System.out.println();
		System.out.print("Ingrese numero 2: ");
		num2 = teclado.nextInt();
		System.out.println();
	}
	
	public void sumar() {
		int suma = num1 + num2;
		System.out.print("Suma: " + suma);
		System.out.println();
	}
	
	public void resta() {
		int resta = num1 - num2;
		System.out.print("Resta: " + resta);
		System.out.println();
	}
	
	public void multiplicacion() {
		int multiplicacion = num1 * num2;
		System.out.print("Multiplicacion: " + multiplicacion);
		System.out.println();
	}
	
	public void division() {
		int division = num1 / num2;
		System.out.print("Division: " + division);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Calculadora calculadora1 = new Calculadora();
		calculadora1.inicializar();
		calculadora1.sumar();
		calculadora1.resta();
		calculadora1.multiplicacion();
		calculadora1.division();
	}
}
