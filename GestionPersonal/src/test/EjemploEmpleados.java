package test;

import java.util.Scanner;

import org.agrijalva.utm.Constantes;
import org.agrijalva.utm.Empleado;
import org.agrijalva.utm.Persona;

public class EjemploEmpleados {
	public static void main(String[] args) {
		
		
		Persona persona = new Persona();
		Empleado empleado = new Empleado();
		Constantes base = new Constantes();
		String contrato;
		int numeroProyectos;
		float porcentaje, porcentaje2, sueldoCompleto;
		
		Scanner exp = new Scanner(System.in);
		
		
		System.out.println("Ingrese nombres de Empleado: ");
		empleado.setNombre(exp.nextLine());
		System.out.println("Ingrese apellidos de Empleado: ");
		empleado.setApellidos(exp.nextLine());
		System.out.println("Ingrese numero de proyectos en que participo el Empleado: ");
		numeroProyectos =exp.nextInt();
		System.out.println("Ingrese sueldo base: ");
		empleado.setSueldoBasico(exp.nextFloat());
		System.out.println("Ingrese tipo de contrato: ");
		contrato = exp.nextLine();
		contrato.toLowerCase();
		
		porcentaje2 = 100 * numeroProyectos /100;
		
		if(contrato.equals("termino indefinido")) {
			porcentaje = base.TERMINO_INDEFINIDO;
			sueldoCompleto = empleado.getProcentajeProyectos() * porcentaje;			
		}else {
			if(contrato.equals("termino fijo")) {
				porcentaje = base.TERMINO_FIJO;
				sueldoCompleto = empleado.getProcentajeProyectos() * porcentaje;
			}else {
				porcentaje = base.PRESTACION_SERVICIOS;
				sueldoCompleto = empleado.getProcentajeProyectos() * porcentaje;
			}
		}
		
		
		
				
		System.out.println("El empleado " + empleado.getNombre() + " " + empleado.getApellidos());
		System.out.println("tiene un sueldo completo de: " + sueldoCompleto);
			
		
	}
}
