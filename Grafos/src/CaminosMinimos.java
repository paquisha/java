public class CaminosMinimos {
    //metodo para determinar todos los caminos
    public String algoritmoFloyd(long [][] mAdy){
        int vertices = mAdy.length;
        long matrizAdyacente [] [] = mAdy;

        String caminos [] [] = new String [vertices] [vertices];
        String caminosAuxiliares [] [] = new String [vertices] [vertices];
        String caminorecorrido = "", cadena = "", caminito = "";
        int i, j, k;
        float temporal1, temporal2, temporal3, temporal4, minimo;
        //inicializamos las matrices
        for(i = 0; i < vertices; i++){
            for(j = 0; j < vertices; j++){
                caminos[i][j] = "";
                caminosAuxiliares[i][j] = "";
            }
        }
        for(k = 0; k < vertices; k++){
            for(i = 0; i< vertices; i++){
                for(j = 0 ; j <vertices; j++){
                    temporal1 = matrizAdyacente[i][j];
                    temporal2 = matrizAdyacente[i][k];
                    temporal3 = matrizAdyacente[k][j];
                    temporal4 = temporal2 + temporal3;
                    //encotramos el minimo
                    minimo = Math.min(temporal1, temporal4);
                    if(temporal1 != temporal4){
                        if(minimo == temporal4){
                            caminorecorrido = "";
                            caminosAuxiliares[i][j] = k + "";
                            caminos[i][j] = caminosR(i, k, caminosAuxiliares, caminorecorrido) + (k + 1);
                        }
                    }
                    matrizAdyacente[i][j] = (long) minimo;

                }
            }
        }
        //agregamos el camino a la cadena
        for(i = 0; i < vertices; i++){
            for(j = 0; j < vertices; j++){
                cadena = cadena + "["+matrizAdyacente[i][j]+"]";
            }
            cadena = cadena + "\n";
        }
        //mostrar caminos
        for(i = 0; i < vertices; i++){
            for(j = 0; j < vertices; j++){
                if(matrizAdyacente[i][j] != 1000000000){
                   if(i != j){
                       if(caminos[i][j].equals("")){
                           caminito += "De (" + (i + 1) + "---->"+(j + 1) + ") Irse por ("+ (i + 1)+ ", " + (j + 1)+")\n";
                       }else{
                           caminito += "De (" + (i + 1) + "--->" +(j + 1) + ") Irse por..("+ (i + 1)+", " + caminos[i][j]+", "+ (j + 1)+")\n";
                       }
                   }
                }
            }
        }
        return "La matriz de caminos mas corto entre los diferntes vertices es:\n" + cadena +
                "\nLos diferentes caminos mas cortos entre vertices son:\n"+ caminito;
    }

    public String caminosR(int i, int k, String[][] caminosAuxiliares, String caminosRecorrido){
        if(caminosAuxiliares[i][k].equals("")){
            return "";
        }else{
            //recursividad al millon
            caminosRecorrido += caminosR(i, Integer.parseInt(caminosAuxiliares[i][k].toString()), caminosAuxiliares, caminosRecorrido)+
                    (Integer.parseInt(caminosAuxiliares[i][k].toString()) + 1)+",";
            return  caminosRecorrido;
        }
    }
}
