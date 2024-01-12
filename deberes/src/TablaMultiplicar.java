import java.util.Scanner;

//Confeccionar una clase que permita ingresar valores enteros por teclado y nos muestre la tabla de
// multiplicar de dicho valor. Finalizar el programa al ingresar el -1.
public class TablaMultiplicar {
    public void cargarValor(){
        Scanner ingreso = new Scanner(System.in);
        int valor;

        do{
            System.out.println("Ingrese Valor");
            valor = ingreso.nextInt();
            if(valor != -1){
                calcular(valor);
            }
        }while(valor != -1);
    }

    public void calcular(int valor){
        for(int contador = 0; contador <= valor * 10; contador = contador + valor){
            System.out.print(contador + "-");
        }
    }

    public static void main(String[] args) {
        TablaMultiplicar tablaMultiplicar = new TablaMultiplicar();
        tablaMultiplicar.cargarValor();
    }
}
