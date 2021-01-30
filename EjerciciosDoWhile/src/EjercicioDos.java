import java.util.Scanner;

public class EjercicioDos {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int cuenta;
		float saldo, suma = 0;
		do {
			System.out.println("Ingrese numero de cuenta: ");
			cuenta = num.nextInt();
			if(cuenta>=0) {
				System.out.println("Ingrese saldo:");
				saldo = num.nextFloat();
				if(saldo>0) {
					System.out.println("Saldo acredor");
					suma = suma + saldo;
				}else {
					if(saldo<0) {
						System.out.println("Saldo deudor");
					}else {
						System.out.println("Saldo nulo");
					}
				}
			}
		}while(cuenta>=0);
		System.out.println("Total de saldo acredores " + suma);
	}
}
