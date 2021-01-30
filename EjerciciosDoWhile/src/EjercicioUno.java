import java.util.Scanner;

public class EjercicioUno {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int suma = 0, acumulador = 0, valor;
		do {
			System.out.print("Ingrese valor: ");
			valor = num.nextInt();
			
			if(valor != 9999) {
				suma = suma + valor;
			}
		}while(valor!=9999);
		System.out.println("la suma de los valores es: " + suma);
		if(suma == 0) {
			System.out.println("valor acumulado es cero");
		}else {
			if(suma>0) {
				System.out.println("el valor acumulado es positivo");
			}else {
				System.out.println("el valor acumulado es negativo");
			}
		}
	}
}
