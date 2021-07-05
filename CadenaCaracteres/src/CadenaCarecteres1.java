import java.util.Scanner;


public class CadenaCarecteres1 {
	//Solicitar el ingreso del nombre y edad de dos personas. Mostrar el nombre de la persona con mayor edad.
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		
		String nombre1, nombre2;
		int edad1, edad2;
		
		System.out.print("Ingrese el nombre: ");
		nombre1= ingreso.next();
		
		System.out.print("Ingrese edad: ");
		edad1 = ingreso.nextInt();
		
		System.out.print("Ingrese nombre: ");
		nombre2 = ingreso.next();
		
		System.out.print("Ingrese edad: ");
		edad2 = ingreso.nextInt();
		
		
		if(edad1 > edad2) {
			System.out.print("Persona mayor de edad es: " + nombre1);
		}else {
			System.out.print("Persona mayor de edad es: " + nombre2);
		}
		
	}
}
