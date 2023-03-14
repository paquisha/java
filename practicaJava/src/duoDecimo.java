import java.util.Scanner;

public class duoDecimo {
    /*Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, imprimir en pantalla la leyenda
    "Todos los números son menores a diez".
    Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10, imprimir en pantalla la leyenda "Alguno de los números es menor a diez".
    * */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int uno, dos,tres;

        System.out.println("Ingrese primer numero: ");
        uno = teclado.nextInt();

        System.out.println("Ingrese segundo numero: ");
        dos = teclado.nextInt();

        System.out.println("Ingrese tercer numero:");
        tres = teclado.nextInt();

        if(uno < 10 && dos < 10 && tres < 10){
            System.out.println("Son menores a 10");
        }else{
            System.out.println("Al menos uno es Mayor");
        }
    }
}
