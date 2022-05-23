package entregas.entrega2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class entrega2 {

    public static void copiarArchivo(File nOrigen, File nDestino, boolean flag) throws IOException {

        FileReader fr = new FileReader(nOrigen);

        BufferedReader br = new BufferedReader(fr);

        /*if(nOrigen.isDirectory(), )*/

        FileWriter fw = new FileWriter(nDestino, false);
        PrintWriter fSup = new PrintWriter(fw);

        /*if(nDestino.isDirectory()){
            Files.copy(nOrigen.toPath(), nDestino.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }else{

        }*/

    }


    public static void main(String[] args) {

        /*copiarArchivo(new File("archivoOrigen.txt"), );*/

    }
}
