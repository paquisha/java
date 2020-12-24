package sueldoOperario;


import java.util.Scanner;



public class SueldoOperario {
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int horasTrabajadas;
		float costoHora;
		float sueldo;
		System.out.print("Ingrese la cantidad de horas trabajadas por el empleado: ");
		horasTrabajadas = num.nextInt();
		System.out.print("Ingrese el valor de la hora: ");
		costoHora = num.nextFloat();
		sueldo = horasTrabajadas * costoHora;
		System.out.print("El empleado debe cobrar: " + sueldo);
	}

}
