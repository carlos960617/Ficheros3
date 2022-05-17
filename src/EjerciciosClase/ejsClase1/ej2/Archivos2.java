package EjerciciosClase.ejsClase1.ej2;

import java.io.File;
import java.io.IOException;

public class Archivos2 {

    public static void main(String[] args) throws IOException {

        File ruta = new File("c:/ficheros");
        ruta.mkdir();
        File f1 = new File(ruta, "file.txt");
        f1.createNewFile();
    }
}
