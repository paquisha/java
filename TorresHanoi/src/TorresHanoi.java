public class TorresHanoi {
    public static void main(String[] args) {
        TorresHanoi prueba = new TorresHanoi();
        prueba.torresHanoi(3,1,2,3);
    }

    //metodo recursivo
    public void torresHanoi(int discos, int torre1, int torre2, int torre3){
        //caso base
        if(discos == 1){
            System.out.println("Mover discos de torre " + torre1 + " a torre " + torre3);
        }else{
            //dominio
            torresHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover discos de torre " + torre1 + " a torre " + torre3);
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
    }
}
