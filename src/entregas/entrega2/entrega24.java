package entregas.entrega2;

import java.io.File;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class entrega24 {

    public static void copiarArchivo(File rutaOrigen, File rutaDestino, boolean flag) throws IOException {


        //El archivo destino no existe
        if(rutaDestino.isDirectory() && flag){

            rutaDestino = new File(rutaDestino+"/"+rutaOrigen.toString());

            Files.copy(rutaOrigen.toPath(), rutaDestino.toPath(), StandardCopyOption.REPLACE_EXISTING);

        //El archivo destino ya existe
        }else if(rutaDestino.isFile() && flag){

            Files.copy(rutaOrigen.toPath(), rutaDestino.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }else{
            throw new AccessDeniedException("El archivo ya existe.");
        }



    }
    public static void main(String[] args) throws IOException {



        //La ruta destino tiene un fichero en el que se sobreescribirá a informacion del archivoOrigen
        copiarArchivo(new File("FicheroOrigen.txt"), new File("MueveFicheros/FicheroDestino.txt"), true);

        //La ruta destino no tiene fichero
        copiarArchivo(new File("FicheroOrigen.txt"), new File("MueveFicheros"), true);

        //El archivo destino esta en un subdirectorio
        copiarArchivo(new File("FicheroOrigen.txt"), new File("MueveFicheros/Subdirectorio/FicheroDestino.txt"), true);

        //En ambos casos con el flag a false se genera la excepción
        copiarArchivo(new File("FicheroOrigen.txt"), new File("MueveFicheros"), false);
        copiarArchivo(new File("FicheroOrigen.txt"), new File("MueveFicheros/FicheroDestino.txt"), false);

    }
}
