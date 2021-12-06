public class FactorialNumero {
    public static void main(String[] args) {

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
}
