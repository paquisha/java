import java.util.Scanner;


public class ProblemaUno {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.print("Ingrese un numero entre 0 y 999:");
			numero = num.nextInt();
			if(numero>=100) {
				System.out.println("tiene tres digitos");
			}else {
				if(numero>=10) {
					System.out.println("tiene dos digitos");
				}else {
					System.out.println("Tiene un digito");
				}
			}
		}while(numero!=0);
	}
}
