package EjerciciosClase.ejsClase3.ej16;

import EjerciciosClase.ejsClase3.ej11_12_13.Punto;

import java.io.*;
import java.util.ArrayList;

public class ej16 {

    public static void escribirArrayListArchivo(ArrayList<Punto> alp, String ruta) throws IOException {

        FileOutputStream fos = new FileOutputStream(ruta);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(alp);

        oos.close();

    }

    public static void main(String[] args) {

    }
}
