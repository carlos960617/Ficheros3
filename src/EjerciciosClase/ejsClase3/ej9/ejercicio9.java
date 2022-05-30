package EjerciciosClase.ejsClase3.ej9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ejercicio9 {

    public static void mostrarArchivosPrecios(File nombre) {

        String contenido = "";
        try{
            RandomAccessFile raf = new RandomAccessFile(nombre, "rw");
            while(true){

                System.out.println(raf.readInt());
                System.out.println(raf.readDouble());

            }


        }catch(IOException ex){
            System.out.println(contenido);
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        mostrarArchivosPrecios(new File("Catalogo.dat"));

    }
}
