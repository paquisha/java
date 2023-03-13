import java.util.Scanner;

public class Decimo {
    /*Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.*/
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int dia, mes;

        System.out.println("Ingrese dia: ");
        dia = teclado.nextInt();

        System.out.println("Ingrese mes: ");
        mes = teclado.nextInt();

        if(dia == 25 && mes == 12){
            System.out.println("Es navidad. " + dia + "-" + mes);
        }else{
            System.out.println("No es navidad. " + dia + "-" + mes);
        }
    }
}
