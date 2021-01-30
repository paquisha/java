import java.util.Scanner;

public class ProblemaTres {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int cantidad1 = 0, cantidad2 = 0, cantidad3 = 0, suma;
		float peso;
		do {
			System.out.println("Ingrese el peso de la pieza( 0 para salir)");
			peso = num.nextFloat();
			if(peso > 10.2) {
				cantidad1++;
			}else {
				if(peso>=9.2) {
					cantidad2++;
				}else {
					if(peso>0) {
						cantidad3++;
					}
				}
			}
		}while(peso!=0);
		suma = cantidad1 + cantidad2 + cantidad3;
		System.out.println("piezas aptas: " + cantidad2);
		System.out.println("Piezas con un peso superior a 10.2: "+ cantidad1);
		System.out.println("Piezas con peso inferior a 9.8: "+ cantidad3);
	}
}
