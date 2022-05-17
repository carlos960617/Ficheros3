package EjerciciosClase.ejsClase1.ej3;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static com.sun.tools.attach.VirtualMachine.list;

public class Archivo3 {

    public static File f2=new File("c:/ficheros/file.txt");;
    public static File f3=new File("c:/ficheros/File_renamed.txt");;

    public static void crearArchivo() throws IOException {


        f2.createNewFile();
    }

    public static void renombrarArchivo(){


        f2.renameTo(f3);
    }

    public static void borrarArchivo(){

        f2.delete();

    }

    public static void main(String[] args) throws IOException {


        crearArchivo();
        renombrarArchivo();
        borrarArchivo();





    }
}
