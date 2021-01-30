import java.util.Scanner;

public class ProblemaDos {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int numero, suma = 0, cantidad = 0, promedio;
		
		do {
			System.out.println("Ingrese numero (o para finalizar)");
			numero = num.nextInt();
			if(numero!=0) {
				suma = suma + numero;
				cantidad++;
			}
		}while(numero!=0);
		
		if(cantidad!=0) {
			promedio = suma / cantidad;
			System.out.println("Promedio de los valores ingresados es: "+promedio);
		}else {
			System.out.println("No se ingresaron valores");
		}
	}
}
