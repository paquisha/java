public class FactorialNumero {
    public static void main(String[] args) {
        FactorialNumero prueba = new FactorialNumero();
        System.out.println("El factorial de 4 mediante metodo recursivo es: " +
                prueba.factorialRecursivo(4));
        //impresion por ciclo
        System.out.println("El factorial de 4 mediante metodo de ciclo es: " +
                prueba.factorialCiclo(4));
    }

    //metodo recursivo
    public int factorialRecursivo(int n){
        //validamos
        if(n < 0){
            return 0;
        }else{
            //caso base
            if(n == 0){
                return 1;
            }else{
                //problema-1(dominio)
                return n * factorialRecursivo(n - 1);
            }
        }
    }

    //metodo factorial mediante un ciclo
    public int factorialCiclo(int n){
        int factor = 1;
        if(n < 0){
            return 0;
        }else{
            while(n != 0){
                factor = n * factor;
                n--;
            }
            return factor;
        }
    }
}
