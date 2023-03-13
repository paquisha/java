import java.util.Scanner;

public class unDecimo {
    /*Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero con el segundo y a este resultado
    se lo multiplica por el tercero.*/
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int uno, dos, tres, resultado;

        System.out.println("Ingrese primer numero: ");
        uno = teclado.nextInt();

        System.out.println("Ingrese segundo numero: ");
        dos = teclado.nextInt();

        System.out.println("Ingrese tercer numero: ");
        tres = teclado.nextInt();

        if(uno == dos && uno == tres){
            resultado = (uno + dos ) * tres;
            System.out.println("Resultado: " + resultado);
        }else{
            System.out.println("No son iguales.");
        }
    }
}
