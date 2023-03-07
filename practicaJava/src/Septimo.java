import java.util.Scanner;

public class Septimo {
    /*
      Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese numero: ");
        numero = teclado.nextInt();

        if(numero > 0){
            System.out.println(numero + " es positivo");
        }else{
            if(numero < 0){
                System.out.println(numero + " es negativo");
            }else{
                System.out.println(numero + " es cero");
            }
        }
    }
}
