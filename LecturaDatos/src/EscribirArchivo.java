import java.io.*;

public class EscribirArchivo {

    public static void main(String[] args) {
        FileWriter archivo = null;
        PrintWriter pw = null;

        try {
            archivo = new FileWriter("/home/aekmot/aprender/java/LecturaDatos/prueba.txt", true);
            pw = new PrintWriter(archivo);

            for(int i = 0; i < 10; i++){
                pw.println("Linea " + i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(archivo != null){
                    archivo.close();
                }
            }catch (Exception ee){
                ee.printStackTrace();
            }
        }

    }
}
