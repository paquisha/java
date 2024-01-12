import java.util.Scanner;

public class Auto {
    public String matricula;
    public  String marca;
    public String tipo;
    public String color;

    public void Avanzar(String matricula){
        System.out.print("Vehiculo con matricula " + matricula + " avanza correctamente");
    }

    public static void main(String[] args) {
        Auto vehiculo = new Auto();
        vehiculo.Avanzar("pyd-234");
    }
}


