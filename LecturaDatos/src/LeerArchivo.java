import java.io.*;


public class LeerArchivo {
    public static void main(String[] args) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try{
            archivo = new File("/home/aekmot/aprender/java/LecturaDatos/prueba.txt");//abrimos archivo
            fr = new FileReader(archivo);//instanciamos objeto de la clase FileReader
            br = new BufferedReader(fr);//instanciamos objeto de la clase BufferedReader

            String linea; //creamos variable local linea de tipo string
            while((linea=br.readLine())!=null)//lemos archivo
                System.out.println(linea);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                //cerramos archivo en en cualqueira de los dos casos
                if(null != fr){
                    fr.close();
                }
            }catch (Exception ee){
                ee.printStackTrace();
            }
        }
    }
}
