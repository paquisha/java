import java.util.Scanner;

public class decimoQuinto {
    /*Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se calcule e informe su rango de variación (debe mostrar el mayor y el menor de ellos)*/
    public static void main(String[] args){
        Scanner ingreso  = new Scanner(System.in);
        int uno, dos, tres;

        System.out.println("Ingrese primer numero:");
        uno = ingreso.nextInt();

        System.out.println("Ingrese segundo numero:");
        dos = ingreso.nextInt();

        System.out.println("Ingrese tercer numero:");
        tres = ingreso.nextInt();

        if(uno < dos && uno < tres){
            System.out.println(uno);
        }else{
            if(dos < tres){
                System.out.println(dos);
            }else{
                System.out.println(tres);
            }
        }

        if(uno > dos && dos > tres){
            System.out.println(uno);
        }else{
            if(dos > tres){
                System.out.println(dos);
            }else{
                System.out.println(tres);
            }
        }
    }
}
