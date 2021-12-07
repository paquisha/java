public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci prueba = new Fibonacci();
        System.out.println("La sucesion fibonaccion mediante recursividad es: " +
                prueba.fibonacciRecursivo(12));

        System.out.println("La sucesion fibonaccion mediante ciclo es: " +
                prueba.fibonaccionCiclo(12));

    }
    //con recursividad
    public int fibonacciRecursivo(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fibonacciRecursivo(n -1) + fibonacciRecursivo(n - 2);
        }
    }
    //metodo con ciclo
    public int fibonaccionCiclo(int n){
        int fibo = 0, primero = 1, segundo = 0;
        while(n > 0){
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        }
        // leer como es la sucesion de fibonacci
        return fibo;
    }
}
