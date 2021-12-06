public class BajarEscaleras {
    public static void main(String[] args) {
        BajarEscaleras objetoPrueba = new BajarEscaleras();
        objetoPrueba.bajarescaleras(10);
    }
    //metodo para bajar escaleras recursividad
    public void bajarescaleras(int escalones){
        if(escalones == 0){
            //respuesta explicita, caso base
            System.out.println("Bajar escaleras finalizado");
        }else{
            //dominio, division del problema original
            try {
                Thread.sleep(500);
                System.out.println("Bajando escalon: " + escalones);
                //recursividad
                bajarescaleras(escalones -1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
