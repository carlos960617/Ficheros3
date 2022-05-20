package entregas.entrega1;

import java.io.*;
import java.util.Scanner;

public class entrega20 {

    public static void clasificadorPalabrasLongitud(String nombre, int umbral, String destinoSuperior, String destinoInferior) throws IOException {

        //Creamos objetos de lectura para fichero fuente
        File f1 = new File(nombre);
        Scanner scr = new Scanner(f1);

        /*Creamos objetos de escritura para ficheros destino (con append set to false para sobreescribir contenido
        de los archivos a cada ejecucion del programa)*/
        FileWriter fw = new FileWriter(destinoSuperior, false);
        PrintWriter fSup = new PrintWriter(fw);
        FileWriter fw2 = new FileWriter(destinoInferior, false);
        PrintWriter fInf = new PrintWriter(fw2);

        //Leemos datos de fichero fuente
        while(scr.hasNext()){
            String value= scr.nextLine();
            //Almacenamos datos en ficheros destino segun longitud
            if(value.length() > umbral){
                fSup.println(value);
            }else{
                fInf.println(value);
            }
        }

        //Cerramos ficheros destino tras editarlos para que no haya errores al querer tratarlos a posteriori
        fSup.flush();
        fSup.close();
        fInf.flush();
        fInf.close();

    }

    public static void main(String[] args) throws IOException {


        clasificadorPalabrasLongitud("listaPalabras.txt", 5, "palabrasMayores.txt", "palabrasMenores.txt");



    }
}
