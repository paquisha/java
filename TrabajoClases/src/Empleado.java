/*Confeccionar una clase que represente un empleado. Definir como atributos 
 * su nombre y su sueldo. Confeccionar los métodos para la carga, 
 * otro para imprimir sus datos y por último uno que imprima un mensaje si 
 * debe pagar impuestos (si el sueldo supera a 3000)
 * */
import java.util.Scanner;

public class Empleado {
	private String nombre;
	private double sueldo;
	private Scanner teclado;
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese nombre de emppleado: ");
		nombre = teclado.next();
		System.out.println("Ingrese sueldo: ");
		sueldo = teclado.nextDouble();
	}
	
	public void imprimirDatos() {
		System.out.println("Nombre empleado: " + nombre);
		System.out.println("Sueldo del empleado: $" + sueldo);
	}

	public void impuestos() {
		if(sueldo > 3000) {
			System.out.println("Empleado: " + nombre + " debe cancelar impuestos");
		}else {
			System.out.println("Empleado: " + nombre + " no debe cancelar impuestos");
		}
	}
	
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado();
		empleado1.inicializar();
		empleado1.imprimirDatos();
		empleado1.impuestos();
		
	}
}
