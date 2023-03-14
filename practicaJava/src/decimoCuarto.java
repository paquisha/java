import java.util.Scanner;

public class decimoCuarto {
    /*De un operario se conoce su sueldo y los años de antigüedad. Se pide confeccionar un programa que lea los datos de entrada e informe:
    a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
    b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
    c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.*/
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        float sueldo, aumento, total;
        int antiguadad;

        System.out.println("Ingrese sueldo de operario:");
        sueldo = ingreso.nextFloat();

        System.out.println("Ingrese antiguedad de operario:");
        antiguadad = ingreso.nextInt();

        if(sueldo < 500 && antiguadad >= 10){
            aumento = (20 * sueldo)/100;
            total = sueldo + aumento;
            System.out.println("Sueldo base: " + sueldo);
            System.out.println("Aumento:" + aumento);
            System.out.println("Total: "+ total);
        }

        if(sueldo < 500 && antiguadad < 10){
            aumento = (5 * sueldo)/100;
            total = sueldo + aumento;
            System.out.println("Sueldo base: " + sueldo);
            System.out.println("Aumento:" + aumento);
            System.out.println("Total: "+ total);
        }

        if(sueldo >= 500){
            System.out.println("Sueldo base: " + sueldo);
        }
    }
}
